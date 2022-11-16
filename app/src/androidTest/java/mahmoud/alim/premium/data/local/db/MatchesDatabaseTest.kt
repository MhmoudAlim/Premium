package mahmoud.alim.premium.data.local.db

import android.content.Context
import android.support.test.filters.SmallTest
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.runBlocking
import mahmoud.alim.premium.data.local.dao.FixtureDao
import mahmoud.alim.premium.data.local.dto.MatchEntity
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

/**
 * @author Mahmoud Alim on 16/11/2022.
 */
@RunWith(AndroidJUnit4::class)
@SmallTest
class MatchesDatabaseTest {

    private lateinit var dao: FixtureDao
    private lateinit var database: MatchesDatabase

    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        database = Room.inMemoryDatabaseBuilder(
            context,
            MatchesDatabase::class.java
        ).allowMainThreadQueries().build()
        dao = database.dao
    }


    @Test
    fun insertMatchEntity_returnTrue() {
        runBlocking {
            val match = MatchEntity(
                id = 1,
                homeTeamName = "Man Utd",
                homeTeamFlag = "",
                awayTeamName = "Liverpool",
                awayTeamFlag = "",
                status = "",
                homeTeamScore = 0,
                awayTeamScore = 1,
                matchDate = ""
            )
            dao.insertMatch(match)
            val job = async(Dispatchers.IO) {
                dao.getAllMatches().collect {
                    assertThat(it).contains(match)
                }
            }
            job.cancelAndJoin()
        }
    }

    @Test
    fun getAllDatabaseEntities_returnAllItemsInDatabase() {
        val entities = listOf('A'..'E')
        runBlocking {
            entities.forEachIndexed { index, c ->
                dao.insertMatch(
                    MatchEntity(
                        id = index,
                        homeTeamName = c.toString(),
                        homeTeamFlag = c.toString(),
                        awayTeamName = c.toString(),
                        awayTeamFlag = c.toString(),
                        status = c.toString(),
                        homeTeamScore = index,
                        awayTeamScore = index,
                        matchDate = c.toString()
                    )
                )
            }
            val job = async(Dispatchers.IO) {
                dao.getAllMatches().collect {
                    it.forEachIndexed { index, entitiy ->
                        assertThat(entitiy.id).isEqualTo(index)
                    }
                    assertThat(it.size).isEqualTo(entities.size)
                }
            }
            job.cancelAndJoin()
        }
    }


    @After
    @Throws(IOException::class)
    fun tearDown() {
        database.close()
    }
}