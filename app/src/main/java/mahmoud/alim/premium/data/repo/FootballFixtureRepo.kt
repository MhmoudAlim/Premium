package mahmoud.alim.premium.data.repo

import kotlinx.coroutines.flow.Flow
import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 11/11/2022.
 */
interface FootballFixtureRepo {

    suspend fun getLeagueMatches(limit: Int?): Result<List<Fixture>>

    suspend fun insertFixture(fixture: Fixture)

    fun getAllSavedFixtures(): Flow<List<Fixture>>

}