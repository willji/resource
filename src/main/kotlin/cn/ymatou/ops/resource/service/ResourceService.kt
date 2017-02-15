package cn.ymatou.ops.resource.service

import java.util.*
import com.google.inject.Inject
import com.google.inject.Singleton
import com.typesafe.config.Config
import com.avaje.ebean.EbeanServer
import cn.ymatou.ops.resource.domain.*
import cn.ymatou.ops.resource.Resource
import cn.ymatou.ops.resource.Value
import org.apache.http.entity.ContentType
import org.apache.http.nio.entity.NStringEntity
import com.fasterxml.jackson.databind.ObjectMapper
import cn.ymatou.ops.resource.util.ExceptionFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule


@Singleton
class ResourceService @Inject constructor(config: Config,
                                          private val ebean: EbeanServer,
                                          private val indexService: IndexService) {
    private val mapper = ObjectMapper().registerModule(KotlinModule())
    private val BasePath = "/${config.getString("elasticsearch.index")}/resource"

    private fun index(resource: Map<String, Any>) {
        val entity = NStringEntity(mapper.writeValueAsString(resource), ContentType.APPLICATION_JSON)
        indexService.client.performRequest("PUT", "$BasePath/${resource["id"]}", mapOf(), entity)
    }

    private fun getType(id: Long): TypeModel {
        return ebean.find(TypeModel::class.java)
                .where()
                .eq("id", id)
                .findUnique() ?: throw ExceptionFactory.notFound("type $id not found")
    }

    private fun getTypeByName(name: String): TypeModel {
        return ebean.find(TypeModel::class.java)
                .where()
                .eq("name", name)
                .findUnique() ?: throw ExceptionFactory.notFound("type $name not found")
    }

    private fun getResource(uuid: String): ResourceModel {
        return ebean.find(ResourceModel::class.java)
                .where()
                .eq("uuid", uuid)
                .findUnique() ?: throw ExceptionFactory.notFound("resource $uuid not found")
    }

    private fun getFieldById(id: Long): FieldModel {
        return ebean.find(FieldModel::class.java)
                .where()
                .eq("id", id)
                .findUnique() ?: throw ExceptionFactory.notFound("field $id not found")
    }

    private fun getFieldByName(type_model_id: Long, name: String): FieldModel {
        return ebean.find(FieldModel::class.java)
                .where()
                .eq("type_model_id", type_model_id)
                .eq("name", name)
                .findUnique() ?: throw ExceptionFactory.notFound("field $name not found")
    }

    private fun getValue(resource_id: Long, field_id: Long): ValueModel {
        return ebean.find(ValueModel::class.java)
                .where()
                .eq("resource_model_id", resource_id)
                .eq("field_id", field_id)
                .findUnique() ?: throw ExceptionFactory.notFound("value $field_id not found")
    }

    fun create(request: Resource): Resource {
        val resourceObjects = ebean.find(ResourceModel::class.java)
                .where()
                .eq("name", request.name)
                .eq("deleted", 0)
                .findList()
        if (resourceObjects.size > 0) {
            throw ExceptionFactory.validationFailed("resource ${request.name} exist")
        }

        val values: MutableSet<ValueModel> = mutableSetOf()
        val valuesList = request.valuesList
        val type = ebean.find(TypeModel::class.java)
                .where()
                .eq("name", request.type)
                .select("id")
                .findList()

        type[0].fields.forEach {
            if (it.is_required == true) {
                val name = it.name
                var number = 0
                request.valuesList.forEach {
                    if (it.filed == name) {
                        number = 1
                    }
                }
                if (number == 0) {
                    throw ExceptionFactory.validationFailed("field ${it.name} is required")
                }
            }
        }

        val fieldMap : MutableMap<String, Int> = mutableMapOf()
        valuesList.forEach {
            if (fieldMap.get(it.filed) == null) {
                fieldMap[it.filed] = 1
            } else {
                fieldMap[it.filed] = 2
            }
        }

        fieldMap.forEach {
            if (it.value == 2) {
                if (getFieldByName(getTypeByName(request.type).id!!, it.key).is_multi == false) {
                    throw ExceptionFactory.validationFailed("field ${it.key} is not multi")
                }
            }
        }

        valuesList.forEach {
            val field = ebean.find(FieldModel::class.java)
                    .where()
                    .eq("type_model_id", type[0].id!!)
                    .eq("name", it.filed)
                    .select("id")
                    .findList()
            if (field[0].is_unique == true) {
                val size = ebean.find(ValueModel::class.java)
                        .where()
                        .eq("field_id", field[0].id!!)
                        .eq("value", it.value)
                        .findList()
                        .size
                if (size > 0) {
                    throw ExceptionFactory.validationFailed("value ${it.value} is exist")
                }
            }


            val value = ValueModel(field_id = field[0].id!!, value = it.value, created_user = it.createdUser,
                    modified_user = it.modifiedUser)
            values.add(value)
        }

        val resourceObject = ResourceModel(uuid = UUID.randomUUID().toString(), name = request.name,
                type_model_id = type[0].id!!, indexed = request.indexed, deleted = request.deleted, refs = request.refs,
                created_user = request.createdUser, modified_user = request.modifiedUser, values = values)
        ebean.save(resourceObject)

        val map = mutableMapOf("id" to resourceObject.id!!, "uuid" to resourceObject.uuid, "name" to resourceObject.name,
                "type_name" to request.type, "indexed" to resourceObject.indexed, "deleted" to resourceObject.deleted,
                "refs" to resourceObject.refs, "created_user" to resourceObject.created_user,
                "modified_user" to resourceObject.modified_user)
        values.forEach {
            val name = getFieldById(it.field_id).name
            map[name] = it.value
        }
        index(map)
        return request
    }

    fun delete(request: Resource): Resource {
        val resource = getResource(request.uuid)
        resource.deleted = true
        indexService.client.performRequest("DELETE", "$BasePath/${resource.id}")
        resource.indexed = false
        ebean.save(resource)
        return request
    }

    fun update(request: Resource): Resource {
        val valuesList = request.valuesList
        val resourceObject = getResource(request.uuid)
        resourceObject.name = request.name
        resourceObject.indexed = request.indexed
        resourceObject.deleted = request.deleted
        resourceObject.modified_user = request.modifiedUser
        ebean.save(resourceObject)

        valuesList.forEach {

            val field_id = getFieldByName(resourceObject.type_model_id, it.filed).id!!
            try {
                val value = getValue(resourceObject.id!!, field_id)
                val history = HistoryModel(resource_id = resourceObject.id, field_id = field_id, value = value.value,
                        created_user = it.modifiedUser, modified_user = it.modifiedUser)
                ebean.save(history)

                value.value = it.value
                ebean.save(value)
            } catch (e: Exception) {
                val valueList: MutableSet<ValueModel> = mutableSetOf()
                val value = ValueModel(field_id = field_id, value = it.value, created_user = it.modifiedUser,
                        modified_user = it.modifiedUser)
                valueList.add(value)

                resourceObject.values = valueList
                ebean.save(resourceObject)
            }
        }

        val values = resourceObject.values
        val type_name = getType(resourceObject.type_model_id).name
        val map = mutableMapOf("id" to resourceObject.id!!, "uuid" to resourceObject.uuid, "name" to resourceObject.name,
                "type_name" to type_name, "indexed" to resourceObject.indexed, "deleted" to resourceObject.deleted,
                "refs" to resourceObject.refs, "created_user" to resourceObject.created_user,
                "modified_user" to resourceObject.modified_user)
        values.forEach {
            val name = getFieldById(it.field_id).name
            map[name] = it.value
        }
        index(map)
        return request
    }

    fun search(query: String, page: Int, size: Int): PagedResponse<Resource> {
        val response = indexService.client.performRequest("GET", "$BasePath/_search",
                mapOf("q" to query, "from" to ((page - 1) * size).toString(), "size" to size.toString()))
        val node = mapper.readTree(response.entity.content)
        val total = node.get("hits").get("total").asInt()
        val pages = Math.ceil(total.toDouble() / size.toDouble()).toInt()
        val content = node.get("hits").get("hits").elements().asSequence().map {
            val uuid = it.get("_source").get("uuid").asText().toString()
            val resourceObject = getResource(uuid)
            val values = resourceObject.values

            val fields: MutableSet<Value> = mutableSetOf()
            values.forEach {
                val value = Value.newBuilder()
                        .setFiled(getFieldById(it.field_id).name)
                        .setValue(it.value)
                        .setCreatedUser(it.created_user)
                        .setModifiedUser(it.modified_user)
                        .build()
                fields.add(value)
            }

            Resource.newBuilder()
                    .setName(it.get("_source").get("name").asText().toString())
                    .setUuid(it.get("_source").get("uuid").asText().toString())
                    .setType(it.get("_source").get("type_name").asText().toString())
                    .setIndexed(it.get("_source").get("indexed").asBoolean())
                    .setDeleted(it.get("_source").get("deleted").asBoolean())
                    .setRefs(it.get("_source").get("refs").asInt())
                    .setCreatedUser(it.get("_source").get("created_user").asText().toString())
                    .setModifiedUser(it.get("_source").get("modified_user").asText().toString())
                    .addAllValues(fields)
                    .build()
        }.toList()
        return PagedResponse(page, size, pages, total, content)
    }
}

