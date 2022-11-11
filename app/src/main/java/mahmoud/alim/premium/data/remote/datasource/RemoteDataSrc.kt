package mahmoud.alim.premium.data.remote.datasource

import mahmoud.alim.premium.data.remote.dto.LeagueDto

/**
 * @author Mahmoud Alim on 11/11/2022.
 */
interface RemoteDataSrc {

    suspend fun getMatches() : LeagueDto

}