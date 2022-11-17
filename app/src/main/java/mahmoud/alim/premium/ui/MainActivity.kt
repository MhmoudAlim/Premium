package mahmoud.alim.premium.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import mahmoud.alim.premium.R
import mahmoud.alim.premium.core.navigation.NavigationAnimation
import mahmoud.alim.premium.core.navigation.Route
import mahmoud.alim.premium.core.navigation.navigate
import mahmoud.alim.premium.core.network.ConnectivityObserver
import mahmoud.alim.premium.ui.screen.favourites.FavouritesScreen
import mahmoud.alim.premium.ui.screen.fixture.FixturesScreen
import mahmoud.alim.premium.ui.theme.PremiumTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var connectivityObserver: ConnectivityObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            PremiumTheme {
                val networkStatus by connectivityObserver.observe()
                    .collectAsState(initial = ConnectivityObserver.NetworkStatus.Idle)
                val navController = rememberNavController()
                ObserveConnectivity(networkStatus)
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

    @Composable
    private fun ObserveConnectivity(
        networkStatus: ConnectivityObserver.NetworkStatus
    ) {
        val context = LocalContext.current
        when (networkStatus) {
            ConnectivityObserver.NetworkStatus.Available,
            ConnectivityObserver.NetworkStatus.Idle -> Unit
            ConnectivityObserver.NetworkStatus.Lost -> Toast.makeText(
                context,
                R.string.network_lost,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
