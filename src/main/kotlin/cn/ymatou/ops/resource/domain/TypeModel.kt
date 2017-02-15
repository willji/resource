package cn.ymatou.ops.resource.domain

import javax.persistence.*
import com.avaje.ebean.Model
import com.avaje.ebean.annotation.Index


@Entity
@Table(name = "type")
class TypeModel(@Id var id: Long? = null,
                @Column(unique = true, nullable = false, length = 64)
                @Index
                val name: String,
                @Column(nullable = true, columnDefinition = "TEXT")
                var description: String? = null,
                @Column(nullable = false)
                var locked: Boolean  = false,
                @Column(nullable = false)
                val created_time: Long = System.currentTimeMillis(),
                @Column(nullable = false)
                var modified_time: Long = System.currentTimeMillis(),
                @Column(nullable = false, length = 64)
                val created_user: String,
                @Column(nullable = false, length = 64)
                var modified_user: String,
                @OneToMany(cascade= arrayOf(CascadeType.ALL))
                var fields: MutableSet<FieldModel> = mutableSetOf()
) : Model()
