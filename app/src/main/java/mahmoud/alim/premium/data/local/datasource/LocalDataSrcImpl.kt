package mahmoud.alim.premium.data.local.datasource

import kotlinx.coroutines.flow.Flow
import mahmoud.alim.premium.data.local.dao.FixtureDao
import mahmoud.alim.premium.data.local.dto.MatchEntity

/**
 * @author Mahmoud Alim on 11/11/2022.
 */
class LocalDataSrcImpl(
    private val dao: FixtureDao
) : LocalDataSrc {

    override fun getAllMatches(): Flow<List<MatchEntity>> {
        return dao.getAllMatches()
    }

    override suspend fun insertMatch(match: MatchEntity) {
        dao.insertMatch(match)
    }
}