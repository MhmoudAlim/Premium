package mahmoud.alim.premium

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.common.truth.Truth.assertThat
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.runBlocking
import mahmoud.alim.premium.core.dispactchers.DispatcherProvider
import mahmoud.alim.premium.core.navigation.Route
import mahmoud.alim.premium.data.repo.FakeFootballFixtureRepoImpl
import mahmoud.alim.premium.data.repo.FootballFixtureRepo
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.domain.usecase.AddFixtureToFavourites
import mahmoud.alim.premium.domain.usecase.FilterUpcomingMatches
import mahmoud.alim.premium.domain.usecase.FixturesUseCases
import mahmoud.alim.premium.domain.usecase.GetAllFavourites
import mahmoud.alim.premium.domain.usecase.GetAllLeagueMatches
import mahmoud.alim.premium.domain.usecase.GroupMatches
import mahmoud.alim.premium.ui.MainActivity
import mahmoud.alim.premium.ui.screen.favourites.FavouritesScreen
import mahmoud.alim.premium.ui.screen.favourites.FavouritesViewModel
import mahmoud.alim.premium.ui.screen.fixture.FixtureViewModel
import mahmoud.alim.premium.ui.screen.fixture.FixturesScreen
import mahmoud.alim.premium.ui.theme.PremiumTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

/**
 * @author Mahmoud Alim on 16/11/2022.
 */

@HiltAndroidTest
class FixtureEndToEndTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    private lateinit var fakeRepo: FootballFixtureRepo
    private lateinit var useCases: FixturesUseCases
    private lateinit var fixtureViewModel: FixtureViewModel
    private lateinit var favouritesViewModel: FavouritesViewModel
    private lateinit var navController: NavHostController
    @Inject lateinit var dispatcher: DispatcherProvider

    @Before
    fun setup() {
        hiltRule.inject()
        fakeRepo = FakeFootballFixtureRepoImpl()
        useCases = FixturesUseCases(
            addFixtureToFavourites = AddFixtureToFavourites(fakeRepo),
            groupMatches = GroupMatches(),
            getAllFavourites = GetAllFavourites(fakeRepo),
            getAllLeagueMatches = GetAllLeagueMatches(fakeRepo),
            filterUpcomingMatches = FilterUpcomingMatches()
        )
        fixtureViewModel = FixtureViewModel(dispatcher = dispatcher, useCases = useCases)
        favouritesViewModel = FavouritesViewModel(useCases = useCases)

        composeRule.setContent {
            PremiumTheme {
                navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.Fixture
                ) {
                    composable(Route.Fixture) {
                        FixturesScreen(
                            viewModel = fixtureViewModel,
                            onNavigate = { navController.navigate(Route.Favourites) })
                    }
                    composable(Route.Favourites) {
                        FavouritesScreen(
                            viewModel = favouritesViewModel,
                        )
                    }
                }
            }
        }
    }


    @Test
    fun fixtureScreenWithAllFixtures_IsDisplayed() {
        runBlocking {
            fakeRepo.getLeagueMatches(500)
        }

        composeRule
            .onNodeWithTag("Fixture")
            .assertIsDisplayed()

        assertThat(navController.currentDestination?.route?.equals(Route.Fixture)).isTrue()

    }


    @Test
    fun addFixtureToFavourites_isSuccess() {
        val favorites = mutableListOf<Fixture>()
        runBlocking {
            fakeRepo.getAllSavedFixtures().collect {
                favorites.addAll(it)
            }
        }

        composeRule
            .onNodeWithTag("Favourite")
            .performClick()

        runBlocking {
            assertThat(favorites.size == 1)
        }
    }
}