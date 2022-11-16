package mahmoud.alim.premium.domain.usecase

import kotlinx.coroutines.runBlocking
import mahmoud.alim.premium.data.repo.FootballFixtureRepo
import mahmoud.alim.premium.data.repo.FakeFootballFixtureRepoImpl
import com.google.common.truth.Truth.assertThat
import mahmoud.alim.premium.domain.model.Fixture
import org.junit.Before
import org.junit.Test

/**
 * @author Mahmoud Alim on 16/11/2022.
 */
class GetAllLeagueMatchesTest {

    private lateinit var fakeRepo: FootballFixtureRepo
    private lateinit var useCase: GetAllLeagueMatches
    private lateinit var allFixturesRecords: List<Fixture>

    @Before
    fun setUp() {
        fakeRepo = FakeFootballFixtureRepoImpl()
        useCase = GetAllLeagueMatches(fakeRepo)
        allFixturesRecords = mutableListOf()
        runBlocking {
            useCase.invoke().map {
                allFixturesRecords = it
            }
        }
    }

    @Test
    fun getAllFixtures_returnsNumberOfAllFixtures() {
        assertThat(allFixturesRecords.size == 26)
    }

    @Test
    fun getFixtures_returnsDifferentItems() {
        runBlocking {
            for (i in 0 until allFixturesRecords.indices.last) {
                assertThat(allFixturesRecords[i].id).isLessThan(allFixturesRecords[i + 1].id)
            }
        }
    }
}