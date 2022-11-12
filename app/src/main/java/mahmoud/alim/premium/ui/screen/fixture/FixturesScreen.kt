package mahmoud.alim.premium.ui.screen.fixture

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import mahmoud.alim.premium.ui.screen.fixture.components.FixturesGroupView
import mahmoud.alim.premium.ui.util.LocalSpacing
import mahmoud.alim.premium.ui.util.UiEvent

/**
 * @author Mahmoud Alim on 13/11/2022.
 */

@Composable
fun FixturesScreen(
    scaffoldState: ScaffoldState,
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
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = it.message.asString(context)
                    )
                }
            }
        }
    }

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