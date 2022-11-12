package mahmoud.alim.premium.ui.screen.fixture

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import mahmoud.alim.premium.R
import mahmoud.alim.premium.core.dispactchers.DispatcherProvider
import mahmoud.alim.premium.core.navigation.Route
import mahmoud.alim.premium.domain.usecase.FixturesUseCases
import mahmoud.alim.premium.ui.screen.fixture.state.FixtureState
import mahmoud.alim.premium.ui.util.UiEvent
import mahmoud.alim.premium.ui.util.UiText
import javax.inject.Inject

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
@HiltViewModel
class FixtureViewModel @Inject constructor(
    private val dispatcher: DispatcherProvider,
    private val useCases: FixturesUseCases
) : ViewModel() {

    init {
        loadAllFixtures()
    }

    var state by mutableStateOf(FixtureState())
        private set

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onEvent(event: FixtureEvent) {
        when (event) {
            is FixtureEvent.OnAddFixtureToFavClicked -> {
                viewModelScope.launch {
                    useCases.addFixtureToFavourites(event.fixture)
                }
            }
            FixtureEvent.OnLoadAllFixtures -> {
                loadAllFixtures()
            }
            FixtureEvent.OnNavigateToFavourites -> {
                viewModelScope.launch {
                    _uiEvent.send(
                        UiEvent.Navigate(Route.Favourites)
                    )
                }
            }
        }
    }

    private fun loadAllFixtures() {
        viewModelScope.launch(dispatcher.io) {
            useCases.getAllLeagueMatches().apply {
                onSuccess { fixturesList ->
                    val fixturesMap = useCases.filterAndGroupMatches(fixturesList)
                    state = state.copy(
                        fixtures = fixturesMap,
                        isSearching = false
                    )
                }
                onFailure {
                    state = state.copy(
                        isSearching = false
                    )
                    _uiEvent.send(
                        UiEvent.ShowSnackBar(
                            UiText.StringResources(R.string.error_something_went_wrong)
                        )
                    )
                }
            }
        }
    }

}