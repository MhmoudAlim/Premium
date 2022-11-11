package mahmoud.alim.premium.data.remote.api

import mahmoud.alim.premium.BuildConfig
import mahmoud.alim.premium.data.remote.dto.LeagueDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query
import java.time.LocalDate

/**
 * @author Mahmoud Alim on 10/11/2022.
 */
interface FootballApi {

    @GET("v4/competitions/PL/matches")
    suspend fun getLeagueMatches(
        @Header("X-Auth-Token") token: String,
        @Query("limit") limit: Int? = null, //Integer [1-500]
    ): LeagueDto


    @GET("v4/competitions/{id}/matches")
    suspend fun getLeagueMatchesWithinRange(
        @Header("X-Auth-Token") token: String,
        @Path("id") leagueId: String = "PL",
        @Query("dateFrom") dateFrom: LocalDate,
        @Query("dataTo") dataTo: LocalDate,
        @Query("limit") limit: Int? = null,
    ): LeagueDto


    companion object {
        const val BASE_URL = "https://api.football-data.org/"
    }
}