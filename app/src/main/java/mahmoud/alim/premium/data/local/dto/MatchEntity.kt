package mahmoud.alim.premium.data.local.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author Mahmoud Alim on 11/11/2022.
 */

@Entity(tableName = MatchEntity.TABLE_NAME)
data class MatchEntity(
    @PrimaryKey
    val id: Int? = null,
    val homeTeamName: String,
    val homeTeamFlag: String,
    val awayTeamName: String,
    val awayTeamFlag: String,
    val status: String,
    val homeTeamScore: Int,
    val awayTeamScore: Int,
    val matchDate: String
){
    companion object{
       const val TABLE_NAME = "MatchEntity"
    }
}