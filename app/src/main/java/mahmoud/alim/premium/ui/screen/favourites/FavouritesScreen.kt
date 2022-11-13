package mahmoud.alim.premium.ui.screen.favourites

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import mahmoud.alim.premium.ui.screen.favourites.components.FavouriteView
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 13/11/2022.
 */
@Composable
fun FavouritesScreen(
    viewModel: FavouritesViewModel = hiltViewModel(),
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    LaunchedEffect(Unit) {
        viewModel.onEvent(FavouritesEvent.OnLoadAllFixtures)
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = spacing.spaceMedium),
    )
    {
        items(state.favourites) {
            FavouriteView(fixture = it)
        }
    }
}
