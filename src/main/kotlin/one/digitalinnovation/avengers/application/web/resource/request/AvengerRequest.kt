package one.digitalinnovation.avengers.application.web.resource.request

import one.digitalinnovation.avengers.domain.avenger.Avenger
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import org.wildfly.common.annotation.NotNull

data class AvengerRequest(
        @field:NotNull
        @field:NotBlank
        @field:NotEmpty
        val nick: String,
        @field:NotNull
        @field:NotBlank
        @field:NotEmpty
        val person: String,
        val description: String? = null,
        val history: String? = null
) {
    fun toAvenger() = Avenger(
            nick = nick,
            person = person,
            description = description,
            history = history
    )

    companion object {
        fun to(id: Long?, request: AvengerRequest) = Avenger(
                id = id,
                nick = request.nick,
                person = request.person,
                description = request.description,
                history = request.history
        )
    }
}