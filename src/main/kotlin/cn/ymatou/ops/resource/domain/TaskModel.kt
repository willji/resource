package cn.ymatou.ops.resource.domain

import com.avaje.ebean.Model
import com.avaje.ebean.annotation.Index
import cn.ymatou.ops.resource.Type
import com.sun.org.apache.xpath.internal.operations.Bool
import javax.persistence.*


@Entity
@Table(name = "task")
class TaskModel(@Id var id: Long? = null,
                @Column(nullable = false)
                @Index
                var status: TaskStatus = TaskStatus.R,
                @Column(nullable = false, columnDefinition = "TEXT")
                var content: String,
                @ManyToOne
                @Column(nullable = false)
                var type_id: Long,
                @Column(nullable = true, columnDefinition = "TEXT")
                var message: String? = null,
                @Column(nullable = false)
                val created_time: Long = System.currentTimeMillis(),
                @Column(nullable = false)
                var modified_time: Long = System.currentTimeMillis(),
                @Column(nullable = false, length = 64)
                val created_user: String,
                @Column(nullable = false, length = 64)
                var modified_user: String
) : Model()
