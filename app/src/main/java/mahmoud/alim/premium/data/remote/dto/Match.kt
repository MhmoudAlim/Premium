package mahmoud.alim.premium.data.remote.dto

import com.squareup.moshi.Json

data class Match(
    @field:Json(name = "id")
    val id: Int,
    @field:Json(name = "awayTeam")
    val awayTeam: AwayTeam,
    @field:Json(name = "homeTeam")
    val homeTeam: HomeTeam,
    @field:Json(name = "score")
    val score: Score?,
    @field:Json(name = "status")
    val status: String,
    @field:Json(name = "utcDate")
    val utcDate: String,
    @field:Json(name = "lastUpdated")
    val lastUpdated: String,
)