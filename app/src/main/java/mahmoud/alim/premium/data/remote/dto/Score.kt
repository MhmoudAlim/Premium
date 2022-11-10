package mahmoud.alim.premium.data.remote.dto

import com.squareup.moshi.Json

data class Score(
    @field:Json(name = "fullTime")
    val fullTime: FullTime?,
    @field:Json(name = "winner")
    val winner: String?
) {
    data class FullTime(
        @field:Json(name = "away")
        val away: Int?,
        @field:Json(name = "home")
        val home: Int?
    )
}
