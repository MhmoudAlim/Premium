package mahmoud.alim.premium.domain.model

import mahmoud.alim.premium.core.date.AppDateTime


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
    val matchDateTime: String
) {
    val matchDateFormatted
        get() = AppDateTime.formatDate(matchDateTime)


    val matchTimeFormatted
        get() = AppDateTime.formatTime(matchDateTime)

}