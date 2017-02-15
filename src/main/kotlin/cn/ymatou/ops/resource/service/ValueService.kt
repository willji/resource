package cn.ymatou.ops.resource.service

import cn.ymatou.ops.resource.*
import com.google.inject.Inject
import com.google.inject.Singleton
import com.avaje.ebean.EbeanServer
import cn.ymatou.ops.resource.domain.*
import cn.ymatou.ops.resource.util.ExceptionFactory


@Singleton
class ValueService @Inject constructor(private val ebean: EbeanServer) {
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

    fun delete(request: Field): Field {
        val typeObject = getType(request.type)
        val fieldObject = getField(typeObject.id!!, request.name)

        val valueList = ebean.find(ValueModel::class.java)
                .where()
                .eq("field_id", fieldObject.id!!)
                .findList()

        valueList.forEach {
            it.delete()
        }

        return request
    }
}

