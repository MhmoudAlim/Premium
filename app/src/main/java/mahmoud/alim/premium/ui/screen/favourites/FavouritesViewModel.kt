package mahmoud.alim.premium.ui.screen.favourites

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import mahmoud.alim.premium.domain.usecase.FixturesUseCases
import mahmoud.alim.premium.ui.screen.favourites.state.FavouritesState
import javax.inject.Inject

/**
 * @author Mahmoud Alim on 13/11/2022.
 */
@HiltViewModel
class FavouritesViewModel @Inject constructor(
    private val useCases: FixturesUseCases
) : ViewModel() {

    init {
        loadAllFavourites()
    }

    var state by mutableStateOf(FavouritesState())
        private set

    fun onEvent(event: FavouritesEvent) {
        when (event) {
            FavouritesEvent.OnLoadAllFixtures -> loadAllFavourites()
        }
    }

    private fun loadAllFavourites() {
        viewModelScope.launch {
            val favFlow = useCases.getAllFavourites()
            favFlow.onEach {
                state = state.copy(
                    favourites = it,
                )
            }
        }
    }
}