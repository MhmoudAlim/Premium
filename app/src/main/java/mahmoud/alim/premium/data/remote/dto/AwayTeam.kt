package mahmoud.alim.premium.data.remote.dto

import com.squareup.moshi.Json

data class AwayTeam(
    @field:Json(name = "crest")
    val crest: String,
    @field:Json(name = "id")
    val id: Int,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "shortName")
    val shortName: String,
    @field:Json(name = "tla")
    val tla: String
)