package mahmoud.alim.premium.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import mahmoud.alim.premium.data.local.dao.FixtureDao
import mahmoud.alim.premium.data.local.dto.MatchEntity

/**
 * @author Mahmoud Alim on 11/11/2022.
 */
@Database(
    entities = [MatchEntity::class],
    version = 1
)
abstract class MatchesDatabase : RoomDatabase() {

    abstract val dao: FixtureDao

    companion object {
        const val DB_NAME = "matches_db"
    }
}