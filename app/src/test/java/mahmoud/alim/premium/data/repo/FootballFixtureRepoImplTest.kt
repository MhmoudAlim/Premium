package mahmoud.alim.premium.data.repo


import com.google.common.truth.Truth.assertThat
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import mahmoud.alim.premium.data.local.datasource.LocalDataSrcImpl
import mahmoud.alim.premium.data.remote.api.FootballApi
import mahmoud.alim.premium.data.remote.datasource.RemoteDataSrcImpl
import mahmoud.alim.premium.data.remote.response.inValidApiResponse
import mahmoud.alim.premium.data.remote.response.validApiResponse
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author Mahmoud Alim on 16/11/2022.
 */
class FootballFixtureRepoImplTest {

    private lateinit var repository: FootballFixtureRepo
    private lateinit var mockWebServer: MockWebServer
    private lateinit var okHttpClient: OkHttpClient
    private lateinit var api: FootballApi

    @Before
    fun setUp() {
        mockWebServer = MockWebServer()
        okHttpClient = OkHttpClient.Builder()
            .writeTimeout(2, TimeUnit.SECONDS)
            .readTimeout(2, TimeUnit.SECONDS)
            .connectTimeout(2, TimeUnit.SECONDS)
            .build()
        api = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(mockWebServer.url("/"))
            .build()
            .create(FootballApi::class.java)
        repository = FootballFixtureRepoImpl(
            local = LocalDataSrcImpl(dao = mockk(relaxed = true)),
            remote = RemoteDataSrcImpl(api = api)
        )
    }


    @Test
    fun searchFixture_withValidResponse_returnSuccessResult() {
        runBlocking {
            mockWebServer.enqueue(
                MockResponse()
                    .setResponseCode(200)
                    .setBody(validApiResponse)
            )
            val result = repository.getLeagueMatches(500)
            assertThat(result.isSuccess).isTrue()
        }
    }


    @Test
    fun searchFixture_withInValidResponse_returnFailure() {
        runBlocking {
            mockWebServer.enqueue(
                MockResponse()
                    .setResponseCode(403)
                    .setBody(validApiResponse)
            )
            val result = repository.getLeagueMatches(500)
            assertThat(result.isFailure).isTrue()
        }
    }

    @Test
    fun searchFixture_withInvalidResponse_returnFailure() {
        runBlocking {
            mockWebServer.enqueue(
                MockResponse()
                    .setResponseCode(200)
                    .setBody(inValidApiResponse)
            )
            val result = repository.getLeagueMatches(500)
            assertThat(result.isFailure).isTrue()
        }
    }


    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }

}