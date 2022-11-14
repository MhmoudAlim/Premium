package mahmoud.alim.premium.domain.usecase

import mahmoud.alim.premium.core.date.AppDateTime
import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 14/11/2022.
 */
class FilterUpcomingMatches {

    operator fun invoke(
        fixtures: List<Pair<String, List<Fixture>>>,
    ) = fixtures.filter { (date, _) ->
        AppDateTime.durationInDaysOf(date)
    }
}