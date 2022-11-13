package mahmoud.alim.premium.domain.usecase

import kotlinx.coroutines.flow.Flow
import mahmoud.alim.premium.data.repo.FootballFixtureRepo
import mahmoud.alim.premium.domain.model.Fixture

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
class GetAllFavourites(private val repo: FootballFixtureRepo) {

     operator fun invoke(): Flow<List<Fixture>> {
        return repo.getAllSavedFixtures()
    }
}