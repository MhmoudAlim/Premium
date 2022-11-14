package mahmoud.alim.premium.ui.screen.fixture

import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
sealed class FixtureEvent {
    object OnLoadUpcomingFixtures : FixtureEvent()
    object OnNavigateToFavourites : FixtureEvent()
    data class ShowAllFixtures(val showAll: Boolean) : FixtureEvent()
    data class OnAddFixtureToFavClicked(val fixture: Fixture) : FixtureEvent()
}