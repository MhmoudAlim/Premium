package mahmoud.alim.premium.domain.model

/**
 * @author Mahmoud Alim on 11/11/2022.
 */

sealed class MatchStatus(val name: String) {
    object Ended : MatchStatus(ENDED)
    object Scheduled : MatchStatus(SCHEDULED)

    companion object {
        fun fromString(name: String): MatchStatus {
            return when (name) {
                ENDED -> Ended
                SCHEDULED -> Scheduled
                else -> Scheduled
            }
        }

        private const val ENDED = "ENDED"
        private const val SCHEDULED = "SCHEDULED"
    }
}