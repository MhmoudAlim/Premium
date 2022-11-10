package mahmoud.alim.premium.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mahmoud.alim.premium.data.remote.api.FootballApi
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
    fun provideOkHttpClient() = OkHttpClient.Builder().apply {
        addInterceptor(
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        )
        connectTimeout(6, TimeUnit.SECONDS)
        readTimeout(6, TimeUnit.SECONDS)
        build()
    }

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
}