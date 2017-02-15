package cn.ymatou.ops.resource.service

import com.google.inject.Inject
import com.google.inject.Singleton
import com.avaje.ebean.EbeanServer
import cn.ymatou.ops.resource.Task
import cn.ymatou.ops.resource.domain.TaskModel
import cn.ymatou.ops.resource.domain.TypeModel
import cn.ymatou.ops.resource.util.ExceptionFactory


@Singleton
class TaskService @Inject constructor(private val ebean: EbeanServer) {

    fun getTask(id: Long): TaskModel {
        return ebean.find(TaskModel::class.java)
                .where()
                .eq("id", id)
                .findUnique() ?: throw ExceptionFactory.notFound("task $id not found")
    }

    private fun getType(id: Long): TypeModel {
        return ebean.find(TypeModel::class.java)
                .where()
                .eq("id", id)
                .findUnique() ?: throw ExceptionFactory.notFound("type $id not found")
    }

    fun search(request: Task): Task {
        val taskObject = getTask(request.id)
        val content = Task.newBuilder()
                .setStatusValue(taskObject.status.ordinal)
                .setContent(taskObject.content)
                .setType(getType(taskObject.type_id).name)
                .setMessage(taskObject.message)
                .setCreatedUser(taskObject.created_user)
                .setModifiedUser(taskObject.modified_user)
                .build()
        return content
    }
}

