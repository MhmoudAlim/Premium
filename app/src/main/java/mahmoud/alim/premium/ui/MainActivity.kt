package mahmoud.alim.premium.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import mahmoud.alim.premium.core.navigation.NavigationAnimation
import mahmoud.alim.premium.core.navigation.Route
import mahmoud.alim.premium.core.navigation.navigate
import mahmoud.alim.premium.ui.screen.favourites.FavouritesScreen
import mahmoud.alim.premium.ui.screen.fixture.FixturesScreen
import mahmoud.alim.premium.ui.theme.PremiumTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PremiumTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.Fixture
                ) {
                    composable(Route.Fixture) {
                        FixturesScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.Favourites) {
                        NavigationAnimation {
                            FavouritesScreen()
                        }
                    }

                }
            }
        }

    }
}
