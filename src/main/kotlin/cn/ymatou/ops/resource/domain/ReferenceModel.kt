package cn.ymatou.ops.resource.domain

import javax.persistence.*
import com.avaje.ebean.Model
import com.avaje.ebean.annotation.Index
import com.sun.org.apache.xpath.internal.operations.Bool


@Entity
@Table(name = "reference")
class ReferenceModel(@Id var id: Long? = null,
                     @Column(nullable = false)
                     var constraint_condition: ConstraintCondition = ConstraintCondition.onetoone,
                     @ManyToOne
                     @Column(nullable = false)
                     var source_field_id: Long,
                     @ManyToOne
                     @Column(nullable = false)
                     var target_field_id: Long,
                     @Column(nullable = false)
                     val created_time: Long = System.currentTimeMillis(),
                     @Column(nullable = false)
                     var modified_time: Long = System.currentTimeMillis(),
                     @Column(nullable = false, length = 64)
                     val created_user: String,
                     @Column(nullable = false, length = 64)
                     var modified_user: String
) : Model()
