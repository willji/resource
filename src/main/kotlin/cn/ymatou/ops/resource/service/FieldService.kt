package cn.ymatou.ops.resource.service

import cn.ymatou.ops.resource.*
import com.google.inject.Inject
import com.google.inject.Singleton
import com.avaje.ebean.EbeanServer
import cn.ymatou.ops.resource.domain.*
import com.typesafe.config.Config
import org.apache.http.entity.ContentType
import org.apache.http.nio.entity.NStringEntity
import cn.ymatou.ops.resource.util.ExceptionFactory
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import kotlin.concurrent.thread


@Singleton
class FieldService @Inject constructor(config: Config,
                                       private val ebean: EbeanServer,
                                       private val indexService: IndexService) {
    private val mapper = ObjectMapper().registerModule(KotlinModule())
    private val BasePath = "/${config.getString("elasticsearch.index")}/resource"

    private fun index(resource: MutableMap<String, Any?>) {
        val entity = NStringEntity(mapper.writeValueAsString(resource), ContentType.APPLICATION_JSON)
        indexService.client.performRequest("PUT", "$BasePath/${resource["id"]}", mapOf(), entity)
    }

    private fun getType(name: String): TypeModel {
        return ebean.find(TypeModel::class.java)
                .where()
                .eq("name", name)
                .findUnique() ?: throw ExceptionFactory.notFound("type $name not found")
    }

    private fun getTypeById(id: Long): TypeModel {
        return ebean.find(TypeModel::class.java)
                .where()
                .eq("id", id)
                .findUnique() ?: throw ExceptionFactory.notFound("type $id not found")
    }

    private fun getField(type_id: Long, name: String): FieldModel {
        return ebean.find(FieldModel::class.java)
                .where()
                .eq("type_model_id", type_id)
                .eq("name", name)
                .findUnique() ?: throw ExceptionFactory.notFound("field $name not found")
    }

    private fun getFieldById(id: Long): FieldModel {
        return ebean.find(FieldModel::class.java)
                .where()
                .eq("id", id)
                .findUnique() ?: throw ExceptionFactory.notFound("field $id not found")
    }

    private fun getReference(source_field_id: Long): ReferenceModel {
        return ebean.find(ReferenceModel::class.java)
                .where()
                .eq("source_field_id", source_field_id)
                .findUnique() ?: throw ExceptionFactory.notFound("reference $source_field_id not found")
    }

    fun create(request: Field): Field {
        val fields: MutableSet<FieldModel> = mutableSetOf()
        val typeObject = getType(request.type)
        val field = FieldModel(name = request.name, display = request.display,
                field_type = FieldType.valueOf(request.fieldType),
                default_value = request.defaultValue, is_required = request.isRequired,
                is_multi = request.isMulti, is_unique = request.isUnique, created_user = request.createdUser,
                modified_user = request.modifiedUser)
        fields.add(field)
        typeObject.fields = fields
        ebean.save(typeObject)

        if (request.referenceType != "" && request.referenceField != "") {
            ebean.save(ReferenceModel(source_field_id = getField(typeObject.id!!, request.name).id!!,
                    target_field_id = getField(getType(request.referenceType).id!!, request.referenceField).id!!,
                    constraint_condition = ConstraintCondition.valueOf(request.constraintCondition),
                    created_user = request.createdUser, modified_user = request.modifiedUser))
        }

        return request
    }

    fun delete(request: Field): Field {
        val typeObject = getType(request.type)
        val fieldObject = getField(typeObject.id!!, request.name)

        val valueList = ebean.find(ValueModel::class.java)
                .where()
                .eq("field_id", fieldObject.id!!)
                .findList()

        if (valueList.size > 0) {
            throw ExceptionFactory.validationFailed("${valueList.size} value of ${fieldObject.name} exists")
        } else {
            try {
                val referenceObject = getReference(fieldObject.id)
                referenceObject.delete()
            } catch (e: Exception) {
            }

            fieldObject.delete()
            batchIndex(typeObject.id!!)
            return request
        }
    }

    fun update(request: Field): Task {
        val taskObject = TaskModel(status = TaskStatus.R, type_id = getType(request.type).id!!, content = "", message = "",
                created_user = request.modifiedUser, modified_user = request.modifiedUser)
        ebean.save(taskObject)

        thread {
            try {
                val typeObject = getType(request.type)
                val fieldObject = getField(typeObject.id!!, request.name)

                if (request.referenceType != "" && request.referenceField != "") {
                    try {
                        val referenceObject = getReference(fieldObject.id!!)
                        referenceObject.source_field_id = getField(typeObject.id!!, request.name).id!!
                        referenceObject.target_field_id = getField(getType(request.referenceType).id!!, request.referenceField).id!!
                        referenceObject.constraint_condition = ConstraintCondition.valueOf(request.constraintCondition)
                    } catch (e: Exception) {
                        ebean.save(ReferenceModel(source_field_id = getField(typeObject.id!!, request.name).id!!,
                                target_field_id = getField(getType(request.referenceType).id!!, request.referenceField).id!!,
                                constraint_condition = ConstraintCondition.valueOf(request.constraintCondition),
                                created_user = request.createdUser, modified_user = request.modifiedUser))
                    }
                }

                fieldObject.name = request.name
                fieldObject.display = request.display
                if (fieldObject.field_type != FieldType.valueOf(request.fieldType)) {

                } else{
                    fieldObject.field_type = FieldType.valueOf(request.fieldType)
                }

                if (fieldObject.default_value != request.defaultValue) {
                    val resourceObjects = ebean.find(ResourceModel::class.java)
                            .where()
                            .eq("type_model_id", getType(request.type).id)
                            .eq("deleted", 0)
                            .findList()

                    resourceObjects.forEach {
                        try {
                            ebean.find(ValueModel::class.java)
                                    .where()
                                    .eq("resource_model_id", it.id)
                                    .eq("field_id", fieldObject.id!!)
                                    .findUnique() ?: throw ExceptionFactory.notFound("field ${fieldObject.id} not found")
                        } catch (e: Exception) {
                            val valueList: MutableSet<ValueModel> = mutableSetOf()
                            val value = ValueModel(field_id = fieldObject.id!!, value = request.defaultValue,
                                    created_user = request.modifiedUser, modified_user = request.modifiedUser)
                            valueList.add(value)
                            it.values = valueList
                            ebean.save(it)
                        }
                    }
                    fieldObject.default_value = request.defaultValue
                } else {
                    fieldObject.default_value = request.defaultValue
                }

                if (fieldObject.is_required != request.isRequired && request.isRequired == true) {
                    val resourceObjects = ebean.find(ResourceModel::class.java)
                            .where()
                            .eq("type_model_id", getType(request.type).id)
                            .eq("deleted", 0)
                            .findList()

                    resourceObjects.forEach {
                        ebean.find(ValueModel::class.java)
                                .where()
                                .eq("resource_model_id", it.id)
                                .eq("field_id", fieldObject.id!!)
                                .findUnique() ?: throw ExceptionFactory.validationFailed("lack value of ${request.name}, can't set is_required=true")
                    }

                    fieldObject.is_required = request.isRequired
                } else {
                    fieldObject.is_required = request.isRequired
                }

                if (fieldObject.is_multi != request.isMulti && request.isMulti == false) {
                    fieldObject.is_multi = request.isMulti
                    val valueObjects = ebean.find(ValueModel::class.java)
                            .where()
                            .eq("field_id", fieldObject.id!!)
                            .findList()

                    val resourceObjects = ebean.find(ResourceModel::class.java)
                            .where()
                            .eq("type_model_id", getType(request.type).id)
                            .eq("deleted", 0)
                            .findList()

                    if (valueObjects.size == resourceObjects.size) {
                        fieldObject.is_unique = request.isUnique
                    } else {
                        throw ExceptionFactory.validationFailed("multi value of ${request.name}, can't set is_multi=false")
                    }
                    fieldObject.is_multi = request.isMulti
                } else {
                    fieldObject.is_multi = request.isMulti
                }

                if (fieldObject.is_unique != request.isUnique && request.isUnique == true) {
                    val valueObjects = ebean.find(ValueModel::class.java)
                            .where()
                            .eq("field_id", fieldObject.id!!)
                            .select("value")
                            .findList()
                    val valueSet: MutableSet<Any> = mutableSetOf()
                    valueObjects.forEach {
                        valueSet.add(it.value)
                    }
                    if (valueObjects.size == valueSet.size) {
                        fieldObject.is_unique = request.isUnique
                    } else {
                        throw ExceptionFactory.validationFailed("repeat value of ${request.name}, can't set is_unique=true")
                    }
                } else {
                    fieldObject.is_unique = request.isUnique
                }

                fieldObject.modified_user = request.modifiedUser
                ebean.save(fieldObject)

                taskObject.status = TaskStatus.S
                ebean.save(taskObject)
            } catch (e: Exception) {
                taskObject.status = TaskStatus.F
                taskObject.content = e.message!!
                ebean.save(taskObject)
            }
        }

        val response = Task.newBuilder()
                .setId(taskObject.id!!)
                .setStatusValue(taskObject.status.ordinal)
                .setContent(taskObject.content)
                .setType(request.type)
                .setMessage(taskObject.message)
                .setCreatedUser(taskObject.created_user)
                .setModifiedUser(taskObject.modified_user)
                .build()
        return response
    }

    private fun batchIndex(type_model_id: Long) {
        val resourceList = ebean.find(ResourceModel::class.java)
                .where()
                .eq("type_model_id", type_model_id)
                .findList()

        resourceList.forEach {
            val typeObject = getTypeById(type_model_id)
            val type_name = typeObject.name
            val valuesList = it.values
            val map = mutableMapOf("id" to it.id, "uuid" to it.uuid, "name" to it.name,
                    "type_name" to type_name, "indexed" to it.indexed, "deleted" to it.deleted,
                    "refs" to it.refs, "created_user" to it.created_user,
                    "modified_user" to it.modified_user)
            valuesList.forEach {
                val name = getFieldById(it.field_id).name
                map[name] = it.value
            }
            index(map)
        }
    }
}

