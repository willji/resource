package cn.ymatou.ops.resource.domain

import javax.persistence.*
import com.avaje.ebean.Model
import cn.ymatou.ops.resource.Field
import com.avaje.ebean.annotation.Index


@Entity
@Table(name = "field", uniqueConstraints = arrayOf(UniqueConstraint(columnNames = arrayOf("type_model_id", "name"))))
class FieldModel(@Id val id: Long? = null,
                 @Column(nullable = false)
                 @Index
                 var name: String,
                 @Column(nullable = false)
                 var display: String,
                 @Column(nullable = false)
                 var field_type: FieldType = FieldType.STRING,
                 @Column(nullable = false)
                 var default_value: String,
                 @Column(nullable = false)
                 var is_required: Boolean = false,
                 @Column(nullable = false)
                 var is_multi: Boolean = false,
                 @Column(nullable = false)
                 var is_unique: Boolean = false,
                 @Column(nullable = false)
                 val created_time: Long = System.currentTimeMillis(),
                 @Column(nullable = false)
                 var modified_time: Long = System.currentTimeMillis(),
                 @Column(nullable = false, length = 64)
                 val created_user: String,
                 @Column(nullable = false, length = 64)
                 var modified_user: String
) : Model() {
    fun toMessage(): Field {
        return Field.newBuilder()
                .setName(name)
                .setDisplay(display)
                .setFieldType(field_type.name)
                .setDefaultValue(default_value)
                .setIsRequired(is_required)
                .setIsMulti(is_multi)
                .setIsUnique(is_unique)
                .setCreatedUser(created_user)
                .setModifiedUser(modified_user)
                .build()
    }
}
