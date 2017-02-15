package cn.ymatou.ops.resource.service

import com.google.inject.Inject
import com.google.inject.Singleton
import com.avaje.ebean.EbeanServer
import cn.ymatou.ops.resource.Type
import cn.ymatou.ops.resource.domain.*
import cn.ymatou.ops.resource.util.ExceptionFactory


@Singleton
class TypeService @Inject constructor(private val ebean: EbeanServer) {
    private fun getType(name: String): TypeModel {
        return ebean.find(TypeModel::class.java)
                .where()
                .eq("name", name)
                .findUnique() ?: throw ExceptionFactory.notFound("type $name not found")
    }

    private fun getField(type_id: Long, name: String): FieldModel {
        return ebean.find(FieldModel::class.java)
                .where()
                .eq("type_model_id", type_id)
                .eq("name", name)
                .findUnique() ?: throw ExceptionFactory.notFound("field $name not found")
    }

    private fun getReference(source_field_id: Long): ReferenceModel {
        return ebean.find(ReferenceModel::class.java)
                .where()
                .eq("source_field_id", source_field_id)
                .findUnique() ?: throw ExceptionFactory.notFound("reference $source_field_id not found")
    }

    fun create(request: Type): Type {
        val fields: MutableSet<FieldModel> = mutableSetOf()
        val fieldsList = request.fieldsList
        fieldsList.forEach {
            val field = FieldModel(name = it.name, display = it.display,
                    field_type = FieldType.valueOf(it.fieldType), default_value = it.defaultValue,
                    is_required = it.isRequired, is_multi = it.isMulti, is_unique = it.isUnique,
                    created_user = it.createdUser, modified_user = it.modifiedUser)
            fields.add(field)
        }

        val typeObject = TypeModel(name = request.name, description = request.description, locked = request.locked,
                created_user = request.createdUser, modified_user = request.modifiedUser, fields = fields)
        ebean.save(typeObject)

        fieldsList.forEach {
            if (it.referenceType != "" && it.referenceField != "") {
                ebean.save(ReferenceModel(source_field_id = getField(typeObject.id!!, it.name).id!!,
                        target_field_id = getField(getType(it.referenceType).id!!, it.referenceField).id!!,
                        constraint_condition = ConstraintCondition.valueOf(it.constraintCondition),
                        created_user = request.createdUser, modified_user = request.modifiedUser))
            }
        }
        return request
    }

    fun delete(request: Type): Type {
        val typeObject = getType(request.name)
        val fieldsList = typeObject.fields

        val resourceList = ebean.find(ResourceModel::class.java)
                .where()
                .eq("type_model_id", typeObject.id!!)
                .eq("deleted", 0)
                .findList()
        if (resourceList.size > 0) {
            throw ExceptionFactory.validationFailed("${resourceList.size} reference of ${typeObject.name} exists")
        }
        else {
            fieldsList.forEach {
                try {
                    val referenceObject = getReference(it.id!!)
                    referenceObject.delete()
                } catch (e: Exception) {
                }
            }
            typeObject.delete()
            return request
        }
    }

    fun update(request: Type): Type {
        val typeObject = getType(request.name)
        typeObject.description = request.description
        typeObject.locked = request.locked
        typeObject.modified_user = request.modifiedUser
        ebean.save(typeObject)
        return request
    }

    fun search(request: Type): Type {
        val typeObject = getType(request.name)
        val fields = typeObject.fields
        val content = Type.newBuilder()
                .setName(typeObject.name)
                .setDescription(typeObject.description)
                .setLocked(typeObject.locked)
                .setCreatedUser(typeObject.created_user)
                .setModifiedUser(typeObject.modified_user)
                .addAllFields(fields.map { it.toMessage() })
                .build()
        return content
    }
}

