package at.htl.beeyond.dto

import at.htl.beeyond.entity.TemplateField
import javax.json.bind.annotation.JsonbTransient
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

class TemplateFieldDto(
        @set:JsonbTransient var id: Long? = null,
        label: String? = null,
        wildcard: String? = null,
        description: String? = null
) {
    constructor(templateField: TemplateField):this(
            templateField.id,
            templateField.label,
            templateField.wildcard,
            templateField.description
    )

    @field:NotBlank @field:Size(max = 255)
    var label:String? = label
        set(value) {
            if (value != null) {
                field = value.trim()
            }
        }

    @field:NotBlank @field:Size(max = 255)
    var wildcard:String? = wildcard
        set(value) {
            if (value != null) {
                field = value.trim()
            }
        }

    @field:Size(max = 255)
    var description:String? = description
        set(value) {
            if (value != null) {
                field = value.trim()
            }
        }
}
