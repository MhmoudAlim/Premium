package mahmoud.alim.premium.domain.usecase

import mahmoud.alim.premium.domain.model.Fixture


/**
 * @author Mahmoud Alim on 12/11/2022.
 */
class GroupMatches {

    operator fun invoke(
        fixtures: List<Fixture>,
    ): List<Pair<String, List<Fixture>>> {
        return fixtures.groupBy {
            it.matchDateFormatted
        }.entries.map { (date, fixtures) ->
            Pair(date, fixtures)
        }
    }
}
