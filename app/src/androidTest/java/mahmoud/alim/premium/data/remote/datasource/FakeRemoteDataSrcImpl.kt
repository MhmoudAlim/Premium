package mahmoud.alim.premium.data.remote.datasource

import mahmoud.alim.premium.data.remote.dto.AwayTeam
import mahmoud.alim.premium.data.remote.dto.HomeTeam
import mahmoud.alim.premium.data.remote.dto.LeagueDto
import mahmoud.alim.premium.data.remote.dto.Match
import mahmoud.alim.premium.data.remote.dto.Score
import mahmoud.alim.premium.data.remote.dto.Score.FullTime

/**
 * @author Mahmoud Alim on 16/11/2022.
 */
class FakeRemoteDataSrcImpl : RemoteDataSrc {

    private val awayTeamInstance
        get() = AwayTeam(
            crest = "https://crests.football-data.org/57.png",
            id = 1,
            name = "Arsenal FC",
            shortName = "Arsenal",
            tla = "ARS"
        )

    private val homeTeamInstance
        get() = HomeTeam(
            crest = "https://crests.football-data.org/64.png",
            id = 2,
            name = "Liverpool FC",
            shortName = "Liverpool",
            tla = "LIV"
        )

    private val scoreInstance
        get() = Score(
            fullTime = FullTime(away = 0, home = 1),
            winner = "LIV"
        )

    override suspend fun getMatches(): LeagueDto {
        val matches = mutableListOf<Match>()
        ('a'..'d').forEachIndexed { index, c ->
            matches.add(
                Match(
                    id = index,
                    awayTeam = awayTeamInstance,
                    homeTeam = homeTeamInstance,
                    score = scoreInstance,
                    status = c.toString(),
                    utcDate = c.toString(),
                    lastUpdated = c.toString()
                )
            )
        }
        return LeagueDto(matches, null)
    }
}