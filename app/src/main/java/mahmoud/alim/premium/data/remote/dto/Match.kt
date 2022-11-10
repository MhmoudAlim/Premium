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
    val status: Status,
    @field:Json(name = "utcDate")
    val utcDate: String,
    @field:Json(name = "lastUpdated")
    val lastUpdated: String,
)


enum class Status {
    SCHEDULED, TIMED, IN_PLAY, PAUSED, EXTRA_TIME, PENALTY_SHOOTOUT, FINISHED, SUSPENDED, POSTPONED, CANCELLED, AWARDED;
}