package mahmoud.alim.premium.domain.mappers

import mahmoud.alim.premium.data.local.dto.MatchEntity
import mahmoud.alim.premium.data.remote.dto.Match
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.domain.model.MatchStatus

/**
 * @author Mahmoud Alim on 11/11/2022.
 */


fun Match.toFixture(): Fixture {
    return Fixture(
        id = id,
        homeTeamName = homeTeam.shortName,
        awayTeamName = awayTeam.shortName,
        homeTeamFlag = homeTeam.crest,
        awayTeamFlag = awayTeam.crest,
        status = MatchStatus.fromString(status),
        homeTeamScore = score?.fullTime?.home,
        awayTeamScore = score?.fullTime?.away,
        matchDateTime = utcDate
    )
}


fun Fixture.toMatchEntity(): MatchEntity {
    return MatchEntity(
        id = id,
        homeTeamName = homeTeamName,
        awayTeamName = awayTeamName,
        homeTeamFlag = homeTeamFlag,
        awayTeamFlag = awayTeamFlag,
        status = status.name,
        homeTeamScore = homeTeamScore ?: 0,
        awayTeamScore = awayTeamScore ?: 0,
        matchDate = matchDateTime
    )
}


fun MatchEntity.toFixture(): Fixture {
    return Fixture(
        id = id,
        homeTeamName = homeTeamName,
        awayTeamName = awayTeamName,
        homeTeamFlag = homeTeamFlag,
        awayTeamFlag = awayTeamFlag,
        status = MatchStatus.fromString(status),
        homeTeamScore = homeTeamScore ,
        awayTeamScore = awayTeamScore,
        matchDateTime = matchDate
    )
}