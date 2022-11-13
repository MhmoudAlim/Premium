package mahmoud.alim.premium.domain.usecase

import androidx.compose.ui.graphics.Color
import mahmoud.alim.premium.core.AppDateTime
import mahmoud.alim.premium.domain.model.Fixture


/**
 * @author Mahmoud Alim on 12/11/2022.
 */
class FilterAndGroupMatches {

    operator fun invoke(
        fixtures: List<Fixture>,
        showUpcomingOnly: Boolean
    ): List<Pair<String, List<Fixture>>> {
        val groupedFixtures = fixtures.groupBy {
            it.matchDateFormatted
        }.entries.map { (date, fixtures) ->
            Pair(date, fixtures)
        }
        return if (showUpcomingOnly) {
            groupedFixtures.filter { (date, _) ->
                AppDateTime.durationInDaysOf(date)
            }
        } else {
            groupedFixtures
        }
    }
}
