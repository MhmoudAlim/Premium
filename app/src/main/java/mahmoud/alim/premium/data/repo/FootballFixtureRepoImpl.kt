package mahmoud.alim.premium.data.repo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.mapNotNull
import mahmoud.alim.premium.data.local.datasource.LocalDataSrc
import mahmoud.alim.premium.data.remote.datasource.RemoteDataSrc
import mahmoud.alim.premium.domain.mappers.toFixture
import mahmoud.alim.premium.domain.mappers.toMatchEntity
import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 11/11/2022.
 */
class FootballFixtureRepoImpl(
    private val remote: RemoteDataSrc,
    private val local: LocalDataSrc,
) : FootballFixtureRepo {

    override suspend fun getLeagueMatches(limit: Int?): Result<List<Fixture>> {
        return try {
            val leagueDto = remote.getMatches()
            Result.success(leagueDto.matches.map { it.toFixture() })
        } catch (e: Exception) {
            e.printStackTrace()
            Result.failure(e)
        }
    }

    override suspend fun insertFixture(fixture: Fixture) {
        local.insertMatch(fixture.toMatchEntity())
    }

    override fun getAllSavedFixtures(): Flow<List<Fixture>> {
        return local.getAllMatches().mapNotNull { entities ->
            entities.map {
                it.toFixture()
            }
        }
    }
}