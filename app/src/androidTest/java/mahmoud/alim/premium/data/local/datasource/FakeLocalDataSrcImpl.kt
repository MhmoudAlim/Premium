package mahmoud.alim.premium.data.local.datasource

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import mahmoud.alim.premium.data.local.dto.MatchEntity

/**
 * @author Mahmoud Alim on 16/11/2022.
 */
class FakeLocalDataSrcImpl : LocalDataSrc {

    private val matchEntities = mutableListOf<MatchEntity>()

    override fun getAllMatches(): Flow<List<MatchEntity>> {
        return flowOf(matchEntities)
    }

    override suspend fun insertMatch(match: MatchEntity) {
        matchEntities.add(match)
    }
}