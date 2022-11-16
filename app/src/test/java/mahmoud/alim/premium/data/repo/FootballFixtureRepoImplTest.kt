package mahmoud.alim.premium.data.repo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import mahmoud.alim.premium.data.local.datasource.LocalDataSrcImplTest
import mahmoud.alim.premium.data.remote.datasource.RemoteDataSrcImplTest
import mahmoud.alim.premium.domain.mappers.toFixture
import mahmoud.alim.premium.domain.mappers.toMatchEntity
import mahmoud.alim.premium.domain.model.Fixture


/**
 * @author Mahmoud Alim on 16/11/2022.
 */
class FootballFixtureRepoImplTest : FootballFixtureRepo {

    private val remoteDataSrc = RemoteDataSrcImplTest()
    private val localDataSrc = LocalDataSrcImplTest()

    override suspend fun getLeagueMatches(limit: Int?): Result<List<Fixture>> {
        return try {
            val leagueDto = remoteDataSrc.getMatches()
            Result.success(leagueDto.matches.map { it.toFixture() })
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun insertFixture(fixture: Fixture) {
        localDataSrc.insertMatch(fixture.toMatchEntity())
    }

    override fun getAllSavedFixtures(): Flow<List<Fixture>> {
        return localDataSrc.getAllMatches().map { entities ->
            entities.map {
                it.toFixture()
            }
        }
    }
}