package cn.ymatou.ops.resource.service

import com.google.inject.Inject
import com.google.inject.Singleton
import com.avaje.ebean.EbeanServer
import cn.ymatou.ops.resource.History
import cn.ymatou.ops.resource.domain.*
import cn.ymatou.ops.resource.util.ExceptionFactory


@Singleton
class HistoryService @Inject constructor(private val ebean: EbeanServer) {
    fun getResource(uuid: String): ResourceModel {
        return ebean.find(ResourceModel::class.java)
                .where()
                .eq("uuid", uuid)
                .findUnique() ?: throw ExceptionFactory.notFound("history $uuid found")
    }

    fun getField(type_model_id: Long, name: String): FieldModel {
        return ebean.find(FieldModel::class.java)
                .where()
                .eq("type_model_id", type_model_id)
                .eq("name", name)
                .findUnique() ?: throw ExceptionFactory.notFound("history $type_model_id $name found")
    }

    fun search(resource: String, field: String, page: Int, size: Int): PagedResponse<History> {
        val resourceObject = getResource(resource)
        val fieldObject  = getField(resourceObject.type_model_id, field)
        val historyList = ebean.find(HistoryModel::class.java)
                .where()
                .eq("resource_id", resourceObject.id!!)
                .eq("field_id", fieldObject.id!!)
                .findList()

        val total = historyList.size
        val pages = Math.ceil(total.toDouble() / size.toDouble()).toInt()

        val histories = mutableListOf<History>()
        historyList.forEach {
            val value =History.newBuilder()
                    .setResource(resourceObject.uuid)
                    .setField(fieldObject.name)
                    .setValue(it.value)
                    .setCreatedUser(it.created_user)
                    .setModifiedUser(it.modified_user)
                    .build()
            histories.add(value)
        }
        val content = histories.toList()
        return PagedResponse(page, size, pages, total, content)
    }
}

