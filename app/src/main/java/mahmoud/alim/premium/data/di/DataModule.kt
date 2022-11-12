package mahmoud.alim.premium.data.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mahmoud.alim.premium.data.local.datasource.LocalDataSrc
import mahmoud.alim.premium.data.local.datasource.LocalDataSrcImpl
import mahmoud.alim.premium.data.local.db.MatchesDatabase
import mahmoud.alim.premium.data.remote.api.FootballApi
import mahmoud.alim.premium.data.remote.datasource.RemoteDataSrc
import mahmoud.alim.premium.data.remote.datasource.RemoteDataSrcImpl
import mahmoud.alim.premium.data.repo.FootballFixtureRepo
import mahmoud.alim.premium.data.repo.FootballFixtureRepoImpl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * @author Mahmoud Alim on 10/11/2022.
 */
@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideOkHttpClient() = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            setLevel(HttpLoggingInterceptor.Level.BODY)
        })
        .connectTimeout(6, TimeUnit.SECONDS)
        .readTimeout(6, TimeUnit.SECONDS)
        .build()


    @Provides
    @Singleton
    fun provideFootballApi(client: OkHttpClient): FootballApi {
        return Retrofit.Builder().apply {
            baseUrl(FootballApi.BASE_URL)
            addConverterFactory(MoshiConverterFactory.create())
            client(client)
        }
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun provideMatchesDatabase(app: Application): MatchesDatabase {
        return Room.databaseBuilder(
            app,
            MatchesDatabase::class.java,
            MatchesDatabase.DB_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideRemoteDataSource(api: FootballApi): RemoteDataSrc {
        return RemoteDataSrcImpl(api)
    }

    @Provides
    @Singleton
    fun provideLocalDataSource(database: MatchesDatabase): LocalDataSrc {
        return LocalDataSrcImpl(database.dao)
    }

    @Provides
    @Singleton
    fun provideFootballFixtureRepo(
        remoteDataSrc: RemoteDataSrc,
        localDataSrc: LocalDataSrc
    ): FootballFixtureRepo {
        return FootballFixtureRepoImpl(remote = remoteDataSrc, local = localDataSrc)
    }


}