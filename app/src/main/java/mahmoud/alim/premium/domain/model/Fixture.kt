package mahmoud.alim.premium.domain.model


/**
 * @author Mahmoud Alim on 11/11/2022.
 */
data class Fixture(
    val id: Int? = null,
    val homeTeamName: String,
    val homeTeamFlag: String,
    val awayTeamName: String,
    val awayTeamFlag: String,
    val status: MatchStatus,
    val homeTeamScore: Int? = null,
    val awayTeamScore: Int? = null,
    val matchDate: String
)