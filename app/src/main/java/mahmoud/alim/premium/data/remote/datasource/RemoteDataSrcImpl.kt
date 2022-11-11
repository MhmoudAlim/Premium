package mahmoud.alim.premium.data.remote.datasource

import mahmoud.alim.premium.BuildConfig
import mahmoud.alim.premium.data.remote.api.FootballApi
import mahmoud.alim.premium.data.remote.dto.LeagueDto
import retrofit2.Response


/**
 * @author Mahmoud Alim on 11/11/2022.
 */
class RemoteDataSrcImpl(
    private val api: FootballApi
) : RemoteDataSrc {

    override suspend fun getMatches(): LeagueDto {
        return api.getLeagueMatches(token = BuildConfig.API_KEY)
    }
}