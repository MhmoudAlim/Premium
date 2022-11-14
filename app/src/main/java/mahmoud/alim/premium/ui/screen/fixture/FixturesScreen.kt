package mahmoud.alim.premium.ui.screen.fixture

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import mahmoud.alim.premium.ui.screen.fixture.components.HomeScaffold
import mahmoud.alim.premium.ui.screen.fixture.components.FixturesGroupView
import mahmoud.alim.premium.ui.util.LocalSpacing
import mahmoud.alim.premium.ui.util.UiEvent

/**
 * @author Mahmoud Alim on 13/11/2022.
 */

@Composable
fun FixturesScreen(
    viewModel: FixtureViewModel = hiltViewModel(),
    onNavigate: (UiEvent.Navigate) -> Unit
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        viewModel.uiEvent.collect {
            when (it) {
                is UiEvent.Navigate -> onNavigate(it)
                is UiEvent.ShowSnackBar -> {
                    Toast.makeText(
                        context,
                        it.message.asString(context),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
    HomeScaffold(onNavigate = {
        viewModel.onEvent(FixtureEvent.OnNavigateToFavourites)
    }) {
        AnimatedVisibility(visible = state.isSearching) {
            CircularProgressIndicator()
        }
        AnimatedVisibility(
            visible = !state.isSearching,
            enter = slideInVertically()
                    + expandVertically(expandFrom = Alignment.Top)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = spacing.spaceMedium),
            ) {
                items(state.fixtures) { (date, fixtures) ->
                    FixturesGroupView(
                        date = date,
                        fixtures = fixtures
                    ) {
                        viewModel.onEvent(
                            FixtureEvent.OnAddFixtureToFavClicked(it)
                        )
                    }
                    Spacer(modifier = Modifier.height(spacing.spaceMedium))
                }
            }
        }
    }
}
