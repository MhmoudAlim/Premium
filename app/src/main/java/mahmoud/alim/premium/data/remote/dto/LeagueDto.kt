package mahmoud.alim.premium.data.remote.dto


import com.squareup.moshi.Json

data class LeagueDto(
    @field:Json(name ="matches")
    val matches: List<Match>,
    @field:Json(name ="resultSet")
    val resultSet: ResultSet
)