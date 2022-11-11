package mahmoud.alim.premium.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mahmoud.alim.premium.data.local.dto.MatchEntity

/**
 * @author Mahmoud Alim on 11/11/2022.
 */

@Dao
interface FixtureDao {

    @Query("SELECT * FROM MatchEntity")
    fun getAllMatches(): Flow<List<MatchEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMatch(match: MatchEntity)
}