package cn.ymatou.ops.resource.domain

import javax.persistence.*
import com.avaje.ebean.Model
import com.avaje.ebean.annotation.Index


@Entity
@Table(name = "resource")
class ResourceModel(@Id val id: Long? = null,
                @Column(nullable = false, unique = true)
                @Index
                val uuid: String,
                @Column(nullable = false)
                var name: String,
                @ManyToOne
                @Column(nullable = false)
                var type_model_id: Long,
                @Column(nullable = false)
                var indexed: Boolean = false,
                @Column(nullable = false)
                var deleted: Boolean = false,
                @Column(nullable = false)
                var refs: Int = 0,
                @Column(nullable = false)
                val created_time: Long = System.currentTimeMillis(),
                @Column(nullable = false)
                var modified_time: Long = System.currentTimeMillis(),
                @Column(nullable = false, length = 64)
                val created_user: String,
                @Column(nullable = false, length = 64)
                var modified_user: String,
                @OneToMany(cascade= arrayOf(CascadeType.ALL))
                var values: MutableSet<ValueModel> = mutableSetOf()

) : Model()
