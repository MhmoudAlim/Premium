package mahmoud.alim.premium.domain.usecase

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
data class FixturesUseCases(
    val addFixtureToFavourites: AddFixtureToFavourites,
    val groupMatches: GroupMatches,
    val getAllFavourites: GetAllFavourites,
    val getAllLeagueMatches: GetAllLeagueMatches,
    val filterUpcomingMatches: FilterUpcomingMatches
)
