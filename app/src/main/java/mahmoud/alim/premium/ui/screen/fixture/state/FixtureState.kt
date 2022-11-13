package mahmoud.alim.premium.ui.screen.fixture.state

import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 12/11/2022.
 */

data class FixtureState(
    val fixtures: List<Pair<String, List<Fixture>>> = emptyList(),
    val isSearching: Boolean = true,
)
