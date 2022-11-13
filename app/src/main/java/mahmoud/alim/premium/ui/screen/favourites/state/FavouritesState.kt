package mahmoud.alim.premium.ui.screen.favourites.state

import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 13/11/2022.
 */

data class FavouritesState(
    val favourites: List<Fixture> = emptyList(),
)
