package mahmoud.alim.premium.data.local.datasource

import kotlinx.coroutines.flow.Flow
import mahmoud.alim.premium.data.local.dto.MatchEntity

/**
 * @author Mahmoud Alim on 11/11/2022.
 */
interface LocalDataSrc {

     fun getAllMatches() : Flow<List<MatchEntity>>

    suspend fun insertMatch(match: MatchEntity)

}