package mahmoud.alim.premium.domain.usecase

import mahmoud.alim.premium.data.repo.FootballFixtureRepo
import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 12/11/2022.
 */

class GetAllLeagueMatches(private val repo: FootballFixtureRepo) {

    suspend operator fun invoke(): Result<List<Fixture>> {

        return repo.getLeagueMatches(500)

    }
}