package cn.ymatou.ops.resource.domain

import javax.persistence.*
import com.avaje.ebean.Model


@Entity
@Table(name = "history")
class HistoryModel(@Id var id: Long? = null,
                     @ManyToOne
                     var resource_id: Long,
                     @ManyToOne
                     var field_id: Long,
                     @Column(nullable = false)
                     var value: String,
                     @Column(nullable = false)
                     val created_time: Long = System.currentTimeMillis(),
                     @Column(nullable = false)
                     var modified_time: Long = System.currentTimeMillis(),
                     @Column(nullable = false, length = 64)
                     val created_user: String,
                     @Column(nullable = false, length = 64)
                     var modified_user: String
) : Model()
