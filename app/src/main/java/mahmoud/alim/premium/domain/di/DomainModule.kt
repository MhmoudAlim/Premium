package mahmoud.alim.premium.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import mahmoud.alim.premium.data.repo.FootballFixtureRepo
import mahmoud.alim.premium.domain.usecase.AddFixtureToFavourites
import mahmoud.alim.premium.domain.usecase.FilterAndGroupMatches
import mahmoud.alim.premium.domain.usecase.FixturesUseCases
import mahmoud.alim.premium.domain.usecase.GetAllFavourites
import mahmoud.alim.premium.domain.usecase.GetAllLeagueMatches

/**
 * @author Mahmoud Alim on 12/11/2022.
 */

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    @ViewModelScoped
    fun provideFixturesUseCases(
        repo: FootballFixtureRepo
    ): FixturesUseCases {
        return FixturesUseCases(
            addFixtureToFavourites = AddFixtureToFavourites(repo),
            filterAndGroupMatches = FilterAndGroupMatches(),
            getAllFavourites = GetAllFavourites(repo),
            getAllLeagueMatches = GetAllLeagueMatches(repo)
        )
    }
}