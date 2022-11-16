package mahmoud.alim.premium.data.repo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import mahmoud.alim.premium.data.local.datasource.FakeLocalDataSrcImpl
import mahmoud.alim.premium.data.remote.datasource.FakeRemoteDataSrcImpl
import mahmoud.alim.premium.domain.mappers.toFixture
import mahmoud.alim.premium.domain.mappers.toMatchEntity
import mahmoud.alim.premium.domain.model.Fixture


/**
 * @author Mahmoud Alim on 16/11/2022.
 */
class FakeFootballFixtureRepoImpl : FootballFixtureRepo {

    var shouldReturnError: Boolean = false

    private val remoteDataSrc = FakeRemoteDataSrcImpl()
    private val localDataSrc = FakeLocalDataSrcImpl()

    override suspend fun getLeagueMatches(limit: Int?): Result<List<Fixture>> {
        return if (shouldReturnError)
            Result.failure(Throwable())
        else {
            val leagueDto = remoteDataSrc.getMatches()
            Result.success(leagueDto.matches.map { it.toFixture() })
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