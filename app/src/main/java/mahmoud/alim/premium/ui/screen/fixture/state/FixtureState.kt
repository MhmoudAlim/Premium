package mahmoud.alim.premium.ui.screen.fixture.state

import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 12/11/2022.
 */

data class FixtureState(
    val allFixtures: List<Pair<String, List<Fixture>>> = emptyList(),
    val upcomingFixtures: List<Pair<String, List<Fixture>>> = emptyList(),
    val viewType: ViewType = ViewType.Filtered,
    val isSearching: Boolean = true,
) {

    val viewList
        get() = when (viewType) {
            ViewType.Filtered -> upcomingFixtures
            ViewType.All -> allFixtures
        }


    enum class ViewType {
        Filtered,
        All;

        companion object {
            fun from(showAll: Boolean = false): ViewType {
                return when (showAll) {
                    true -> All
                    false -> Filtered
                }
            }
        }
    }

}
