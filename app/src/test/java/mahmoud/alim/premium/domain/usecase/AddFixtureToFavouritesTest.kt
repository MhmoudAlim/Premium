package mahmoud.alim.premium.domain.usecase

import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import mahmoud.alim.premium.data.repo.FootballFixtureRepo
import mahmoud.alim.premium.data.repo.FakeFootballFixtureRepoImpl
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.domain.model.MatchStatus
import org.junit.Before
import org.junit.Test

/**
 * @author Mahmoud Alim on 16/11/2022.
 */
class AddFixtureToFavouritesTest {

    private lateinit var fakeRepo: FootballFixtureRepo
    private lateinit var useCase: AddFixtureToFavourites
    private lateinit var favRecords: MutableList<Fixture>

    @Before
    fun setUp() {
        fakeRepo = FakeFootballFixtureRepoImpl()
        useCase = AddFixtureToFavourites(fakeRepo)
        favRecords = mutableListOf()
    }

    @Test
    fun addFavoritesOnEachItemAdded_isReturnedSuccessfullyFromRepo() {
        runBlocking {
            ('a'..'e').forEachIndexed { index, item ->
                useCase.invoke(
                    Fixture(
                        id = index,
                        homeTeamScore = index,
                        homeTeamFlag = item.toString(),
                        homeTeamName = item.toString(),
                        awayTeamScore = index,
                        awayTeamFlag = item.toString(),
                        awayTeamName = item.toString(),
                        status = MatchStatus.fromString(item.toString()),
                        matchDateTime = item.toString()
                    )
                )
                fakeRepo.getAllSavedFixtures().onEach { entities ->
                    assertThat(entities.size).isEqualTo(index)
                }
            }
        }
    }


    @Test
    fun addNumberOfFavorites_isEqualToNumberOfAllSavedFavs() {
        val fixtures = listOf('a'..'e')
        runBlocking {
            fixtures.forEachIndexed { index, item ->
                useCase.invoke(
                    Fixture(
                        id = index,
                        homeTeamScore = index,
                        homeTeamFlag = item.toString(),
                        homeTeamName = item.toString(),
                        awayTeamScore = index,
                        awayTeamFlag = item.toString(),
                        awayTeamName = item.toString(),
                        status = MatchStatus.fromString(item.toString()),
                        matchDateTime = item.toString()
                    )
                )
            }
            fakeRepo.getAllSavedFixtures().map { entities ->
                favRecords.addAll(entities)
            }.launchIn(this)
        }
        assertThat(favRecords.size).isEqualTo(fixtures.size)
    }
}