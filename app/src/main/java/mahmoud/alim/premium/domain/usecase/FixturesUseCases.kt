package mahmoud.alim.premium.domain.usecase

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
data class FixturesUseCases(
    val addFixtureToFavourites: AddFixtureToFavourites,
    val filterAndGroupMatches: FilterAndGroupMatches,
    val getAllFavourites: GetAllFavourites,
    val getAllLeagueMatches: GetAllLeagueMatches
)
