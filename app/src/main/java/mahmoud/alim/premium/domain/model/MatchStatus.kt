package mahmoud.alim.premium.domain.model

/**
 * @author Mahmoud Alim on 11/11/2022.
 */

sealed class MatchStatus(val name: String) {
    object Ended : MatchStatus(FINISHED)
    object Scheduled : MatchStatus(SCHEDULED)

    companion object {
        fun fromString(name: String): MatchStatus {
            return when (name) {
                FINISHED -> Ended
                SCHEDULED -> Scheduled
                else -> Scheduled
            }
        }

        private const val FINISHED = "FINISHED"
        private const val SCHEDULED = "SCHEDULED"
    }
}