package mahmoud.alim.premium.data.remote.response

/**
 * @author Mahmoud Alim on 16/11/2022.
 */
val inValidApiResponse = """
   {
    "filters": {
        "season": "2022"
    },
    "resultDetails": {
        "count": 60,
        "first": "2022-11-12",
        "last": "2023-01-21",
        "played": 10
    },
    "competition": {
        "id": 2021,
        "name": "Premier League",
        "code": "PL",
        "type": "LEAGUE",
        "emblem": "https://crests.football-data.org/PL.png"
    },
    "fixtures": [
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416230,
            "utcDate": "2022-11-12T12:30:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 65,
                "name": "Manchester City FC",
                "shortName": "Man City",
                "tla": "MCI",
                "crest": "https://crests.football-data.org/65.png"
            },
            "teamA": {
                "id": 402,
                "name": "Brentford FC",
                "shortName": "Brentford",
                "tla": "BRE",
                "crest": "https://crests.football-data.org/402.png"
            },
            "score": {
                "winner": "AWAY_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 1,
                    "away": 2
                },
                "halfTime": {
                    "home": 1,
                    "away": 1
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11309,
                    "name": "Peter Bankes",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416226,
            "utcDate": "2022-11-12T15:00:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 563,
                "name": "West Ham United FC",
                "shortName": "West Ham",
                "tla": "WHU",
                "crest": "https://crests.football-data.org/563.png"
            },
            "awayTeam": {
                "id": 338,
                "name": "Leicester City FC",
                "shortName": "Leicester City",
                "tla": "LEI",
                "crest": "https://crests.football-data.org/338.png"
            },
            "score": {
                "winner": "AWAY_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 0,
                    "away": 2
                },
                "halfTime": {
                    "home": 0,
                    "away": 1
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 23568,
                    "name": "Jarred Gillett",
                    "type": "REFEREE",
                    "nationality": "Australia"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416227,
            "utcDate": "2022-11-12T15:00:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 73,
                "name": "Tottenham Hotspur FC",
                "shortName": "Tottenham",
                "tla": "TOT",
                "crest": "https://crests.football-data.org/73.svg"
            },
            "awayTeam": {
                "id": 341,
                "name": "Leeds United FC",
                "shortName": "Leeds United",
                "tla": "LEE",
                "crest": "https://crests.football-data.org/341.png"
            },
            "score": {
                "winner": "HOME_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 4,
                    "away": 3
                },
                "halfTime": {
                    "home": 1,
                    "away": 2
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11405,
                    "name": "Michael Salisbury",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416228,
            "utcDate": "2022-11-12T15:00:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 351,
                "name": "Nottingham Forest FC",
                "shortName": "Nottingham",
                "tla": "NOT",
                "crest": "https://crests.football-data.org/351.png"
            },
            "awayTeam": {
                "id": 354,
                "name": "Crystal Palace FC",
                "shortName": "Crystal Palace",
                "tla": "CRY",
                "crest": "https://crests.football-data.org/354.png"
            },
            "score": {
                "winner": "HOME_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 1,
                    "away": 0
                },
                "halfTime": {
                    "home": 0,
                    "away": 0
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11327,
                    "name": "John Brooks",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416231,
            "utcDate": "2022-11-12T15:00:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 64,
                "name": "Liverpool FC",
                "shortName": "Liverpool",
                "tla": "LIV",
                "crest": "https://crests.football-data.org/64.png"
            },
            "awayTeam": {
                "id": 340,
                "name": "Southampton FC",
                "shortName": "Southampton",
                "tla": "SOU",
                "crest": "https://crests.football-data.org/340.png"
            },
            "score": {
                "winner": "HOME_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 3,
                    "away": 1
                },
                "halfTime": {
                    "home": 3,
                    "away": 1
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11430,
                    "name": "Simon Hooper",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416234,
            "utcDate": "2022-11-12T15:00:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 1044,
                "name": "AFC Bournemouth",
                "shortName": "Bournemouth",
                "tla": "BOU",
                "crest": "https://crests.football-data.org/1044.png"
            },
            "awayTeam": {
                "id": 62,
                "name": "Everton FC",
                "shortName": "Everton",
                "tla": "EVE",
                "crest": "https://crests.football-data.org/62.png"
            },
            "score": {
                "winner": "HOME_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 3,
                    "away": 0
                },
                "halfTime": {
                    "home": 2,
                    "away": 0
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11585,
                    "name": "Craig Pawson",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416229,
            "utcDate": "2022-11-12T17:30:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 67,
                "name": "Newcastle United FC",
                "shortName": "Newcastle",
                "tla": "NEW",
                "crest": "https://crests.football-data.org/67.png"
            },
            "awayTeam": {
                "id": 61,
                "name": "Chelsea FC",
                "shortName": "Chelsea",
                "tla": "CHE",
                "crest": "https://crests.football-data.org/61.png"
            },
            "score": {
                "winner": "HOME_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 1,
                    "away": 0
                },
                "halfTime": {
                    "home": 0,
                    "away": 0
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11446,
                    "name": "Robert Jones",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416225,
            "utcDate": "2022-11-12T19:45:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 76,
                "name": "Wolverhampton Wanderers FC",
                "shortName": "Wolverhampton",
                "tla": "WOL",
                "crest": "https://crests.football-data.org/76.svg"
            },
            "awayTeam": {
                "id": 57,
                "name": "Arsenal FC",
                "shortName": "Arsenal",
                "tla": "ARS",
                "crest": "https://crests.football-data.org/57.png"
            },
            "score": {
                "winner": "AWAY_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 0,
                    "away": 2
                },
                "halfTime": {
                    "home": 0,
                    "away": 0
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11494,
                    "name": "Stuart Attwell",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416233,
            "utcDate": "2022-11-13T14:00:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 397,
                "name": "Brighton & Hove Albion FC",
                "shortName": "Brighton Hove",
                "tla": "BHA",
                "crest": "https://crests.football-data.org/397.svg"
            },
            "awayTeam": {
                "id": 58,
                "name": "Aston Villa FC",
                "shortName": "Aston Villa",
                "tla": "AVL",
                "crest": "https://crests.football-data.org/58.png"
            },
            "score": {
                "winner": "AWAY_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 1,
                    "away": 2
                },
                "halfTime": {
                    "home": 1,
                    "away": 1
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11443,
                    "name": "Chris Kavanagh",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416232,
            "utcDate": "2022-11-13T16:30:00Z",
            "status": "FINISHED",
            "matchday": 16,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-11-16T16:20:25Z",
            "homeTeam": {
                "id": 63,
                "name": "Fulham FC",
                "shortName": "Fulham",
                "tla": "FUL",
                "crest": "https://crests.football-data.org/63.svg"
            },
            "awayTeam": {
                "id": 66,
                "name": "Manchester United FC",
                "shortName": "Man United",
                "tla": "MUN",
                "crest": "https://crests.football-data.org/66.png"
            },
            "score": {
                "winner": "AWAY_TEAM",
                "duration": "REGULAR",
                "fullTime": {
                    "home": 1,
                    "away": 2
                },
                "halfTime": {
                    "home": 0,
                    "away": 1
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": [
                {
                    "id": 11520,
                    "name": "Paul Tierney",
                    "type": "REFEREE",
                    "nationality": "England"
                }
            ]
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416222,
            "utcDate": "2022-12-26T12:30:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 402,
                "name": "Brentford FC",
                "shortName": "Brentford",
                "tla": "BRE",
                "crest": "https://crests.football-data.org/402.png"
            },
            "awayTeam": {
                "id": 73,
                "name": "Tottenham Hotspur FC",
                "shortName": "Tottenham",
                "tla": "TOT",
                "crest": "https://crests.football-data.org/73.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416215,
            "utcDate": "2022-12-26T15:00:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 340,
                "name": "Southampton FC",
                "shortName": "Southampton",
                "tla": "SOU",
                "crest": "https://crests.football-data.org/340.png"
            },
            "awayTeam": {
                "id": 397,
                "name": "Brighton & Hove Albion FC",
                "shortName": "Brighton Hove",
                "tla": "BHA",
                "crest": "https://crests.football-data.org/397.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416217,
            "utcDate": "2022-12-26T15:00:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 338,
                "name": "Leicester City FC",
                "shortName": "Leicester City",
                "tla": "LEI",
                "crest": "https://crests.football-data.org/338.png"
            },
            "awayTeam": {
                "id": 67,
                "name": "Newcastle United FC",
                "shortName": "Newcastle",
                "tla": "NEW",
                "crest": "https://crests.football-data.org/67.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416219,
            "utcDate": "2022-12-26T15:00:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 62,
                "name": "Everton FC",
                "shortName": "Everton",
                "tla": "EVE",
                "crest": "https://crests.football-data.org/62.png"
            },
            "awayTeam": {
                "id": 76,
                "name": "Wolverhampton Wanderers FC",
                "shortName": "Wolverhampton",
                "tla": "WOL",
                "crest": "https://crests.football-data.org/76.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416220,
            "utcDate": "2022-12-26T15:00:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 354,
                "name": "Crystal Palace FC",
                "shortName": "Crystal Palace",
                "tla": "CRY",
                "crest": "https://crests.football-data.org/354.png"
            },
            "awayTeam": {
                "id": 63,
                "name": "Fulham FC",
                "shortName": "Fulham",
                "tla": "FUL",
                "crest": "https://crests.football-data.org/63.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416223,
            "utcDate": "2022-12-26T17:30:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 58,
                "name": "Aston Villa FC",
                "shortName": "Aston Villa",
                "tla": "AVL",
                "crest": "https://crests.football-data.org/58.png"
            },
            "awayTeam": {
                "id": 64,
                "name": "Liverpool FC",
                "shortName": "Liverpool",
                "tla": "LIV",
                "crest": "https://crests.football-data.org/64.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416224,
            "utcDate": "2022-12-26T20:00:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 57,
                "name": "Arsenal FC",
                "shortName": "Arsenal",
                "tla": "ARS",
                "crest": "https://crests.football-data.org/57.png"
            },
            "awayTeam": {
                "id": 563,
                "name": "West Ham United FC",
                "shortName": "West Ham",
                "tla": "WHU",
                "crest": "https://crests.football-data.org/563.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416221,
            "utcDate": "2022-12-27T17:30:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 61,
                "name": "Chelsea FC",
                "shortName": "Chelsea",
                "tla": "CHE",
                "crest": "https://crests.football-data.org/61.png"
            },
            "awayTeam": {
                "id": 1044,
                "name": "AFC Bournemouth",
                "shortName": "Bournemouth",
                "tla": "BOU",
                "crest": "https://crests.football-data.org/1044.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416216,
            "utcDate": "2022-12-27T20:00:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 66,
                "name": "Manchester United FC",
                "shortName": "Man United",
                "tla": "MUN",
                "crest": "https://crests.football-data.org/66.png"
            },
            "awayTeam": {
                "id": 351,
                "name": "Nottingham Forest FC",
                "shortName": "Nottingham",
                "tla": "NOT",
                "crest": "https://crests.football-data.org/351.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416218,
            "utcDate": "2022-12-28T20:00:00Z",
            "status": "TIMED",
            "matchday": 17,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 341,
                "name": "Leeds United FC",
                "shortName": "Leeds United",
                "tla": "LEE",
                "crest": "https://crests.football-data.org/341.png"
            },
            "awayTeam": {
                "id": 65,
                "name": "Manchester City FC",
                "shortName": "Man City",
                "tla": "MCI",
                "crest": "https://crests.football-data.org/65.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416206,
            "utcDate": "2022-12-30T19:45:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 563,
                "name": "West Ham United FC",
                "shortName": "West Ham",
                "tla": "WHU",
                "crest": "https://crests.football-data.org/563.png"
            },
            "awayTeam": {
                "id": 402,
                "name": "Brentford FC",
                "shortName": "Brentford",
                "tla": "BRE",
                "crest": "https://crests.football-data.org/402.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416211,
            "utcDate": "2022-12-30T20:00:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 64,
                "name": "Liverpool FC",
                "shortName": "Liverpool",
                "tla": "LIV",
                "crest": "https://crests.football-data.org/64.png"
            },
            "awayTeam": {
                "id": 338,
                "name": "Leicester City FC",
                "shortName": "Leicester City",
                "tla": "LEI",
                "crest": "https://crests.football-data.org/338.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416205,
            "utcDate": "2022-12-31T12:30:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:15Z",
            "homeTeam": {
                "id": 76,
                "name": "Wolverhampton Wanderers FC",
                "shortName": "Wolverhampton",
                "tla": "WOL",
                "crest": "https://crests.football-data.org/76.svg"
            },
            "awayTeam": {
                "id": 66,
                "name": "Manchester United FC",
                "shortName": "Man United",
                "tla": "MUN",
                "crest": "https://crests.football-data.org/66.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416209,
            "utcDate": "2022-12-31T15:00:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 67,
                "name": "Newcastle United FC",
                "shortName": "Newcastle",
                "tla": "NEW",
                "crest": "https://crests.football-data.org/67.png"
            },
            "awayTeam": {
                "id": 341,
                "name": "Leeds United FC",
                "shortName": "Leeds United",
                "tla": "LEE",
                "crest": "https://crests.football-data.org/341.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416210,
            "utcDate": "2022-12-31T15:00:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 65,
                "name": "Manchester City FC",
                "shortName": "Man City",
                "tla": "MCI",
                "crest": "https://crests.football-data.org/65.png"
            },
            "awayTeam": {
                "id": 62,
                "name": "Everton FC",
                "shortName": "Everton",
                "tla": "EVE",
                "crest": "https://crests.football-data.org/62.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416212,
            "utcDate": "2022-12-31T15:00:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 63,
                "name": "Fulham FC",
                "shortName": "Fulham",
                "tla": "FUL",
                "crest": "https://crests.football-data.org/63.svg"
            },
            "awayTeam": {
                "id": 340,
                "name": "Southampton FC",
                "shortName": "Southampton",
                "tla": "SOU",
                "crest": "https://crests.football-data.org/340.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416214,
            "utcDate": "2022-12-31T15:00:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 1044,
                "name": "AFC Bournemouth",
                "shortName": "Bournemouth",
                "tla": "BOU",
                "crest": "https://crests.football-data.org/1044.png"
            },
            "awayTeam": {
                "id": 354,
                "name": "Crystal Palace FC",
                "shortName": "Crystal Palace",
                "tla": "CRY",
                "crest": "https://crests.football-data.org/354.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416213,
            "utcDate": "2022-12-31T17:30:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 397,
                "name": "Brighton & Hove Albion FC",
                "shortName": "Brighton Hove",
                "tla": "BHA",
                "crest": "https://crests.football-data.org/397.svg"
            },
            "awayTeam": {
                "id": 57,
                "name": "Arsenal FC",
                "shortName": "Arsenal",
                "tla": "ARS",
                "crest": "https://crests.football-data.org/57.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416207,
            "utcDate": "2023-01-01T14:00:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 73,
                "name": "Tottenham Hotspur FC",
                "shortName": "Tottenham",
                "tla": "TOT",
                "crest": "https://crests.football-data.org/73.svg"
            },
            "awayTeam": {
                "id": 58,
                "name": "Aston Villa FC",
                "shortName": "Aston Villa",
                "tla": "AVL",
                "crest": "https://crests.football-data.org/58.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416208,
            "utcDate": "2023-01-01T16:30:00Z",
            "status": "TIMED",
            "matchday": 18,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 351,
                "name": "Nottingham Forest FC",
                "shortName": "Nottingham",
                "tla": "NOT",
                "crest": "https://crests.football-data.org/351.png"
            },
            "awayTeam": {
                "id": 61,
                "name": "Chelsea FC",
                "shortName": "Chelsea",
                "tla": "CHE",
                "crest": "https://crests.football-data.org/61.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416202,
            "utcDate": "2023-01-02T17:30:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 402,
                "name": "Brentford FC",
                "shortName": "Brentford",
                "tla": "BRE",
                "crest": "https://crests.football-data.org/402.png"
            },
            "awayTeam": {
                "id": 64,
                "name": "Liverpool FC",
                "shortName": "Liverpool",
                "tla": "LIV",
                "crest": "https://crests.football-data.org/64.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416197,
            "utcDate": "2023-01-03T19:45:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 338,
                "name": "Leicester City FC",
                "shortName": "Leicester City",
                "tla": "LEI",
                "crest": "https://crests.football-data.org/338.png"
            },
            "awayTeam": {
                "id": 63,
                "name": "Fulham FC",
                "shortName": "Fulham",
                "tla": "FUL",
                "crest": "https://crests.football-data.org/63.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416199,
            "utcDate": "2023-01-03T19:45:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 62,
                "name": "Everton FC",
                "shortName": "Everton",
                "tla": "EVE",
                "crest": "https://crests.football-data.org/62.png"
            },
            "awayTeam": {
                "id": 397,
                "name": "Brighton & Hove Albion FC",
                "shortName": "Brighton Hove",
                "tla": "BHA",
                "crest": "https://crests.football-data.org/397.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416196,
            "utcDate": "2023-01-03T20:00:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 66,
                "name": "Manchester United FC",
                "shortName": "Man United",
                "tla": "MUN",
                "crest": "https://crests.football-data.org/66.png"
            },
            "awayTeam": {
                "id": 1044,
                "name": "AFC Bournemouth",
                "shortName": "Bournemouth",
                "tla": "BOU",
                "crest": "https://crests.football-data.org/1044.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416204,
            "utcDate": "2023-01-03T20:00:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 57,
                "name": "Arsenal FC",
                "shortName": "Arsenal",
                "tla": "ARS",
                "crest": "https://crests.football-data.org/57.png"
            },
            "awayTeam": {
                "id": 67,
                "name": "Newcastle United FC",
                "shortName": "Newcastle",
                "tla": "NEW",
                "crest": "https://crests.football-data.org/67.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416195,
            "utcDate": "2023-01-04T19:30:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 340,
                "name": "Southampton FC",
                "shortName": "Southampton",
                "tla": "SOU",
                "crest": "https://crests.football-data.org/340.png"
            },
            "awayTeam": {
                "id": 351,
                "name": "Nottingham Forest FC",
                "shortName": "Nottingham",
                "tla": "NOT",
                "crest": "https://crests.football-data.org/351.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416198,
            "utcDate": "2023-01-04T19:45:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:14Z",
            "homeTeam": {
                "id": 341,
                "name": "Leeds United FC",
                "shortName": "Leeds United",
                "tla": "LEE",
                "crest": "https://crests.football-data.org/341.png"
            },
            "awayTeam": {
                "id": 563,
                "name": "West Ham United FC",
                "shortName": "West Ham",
                "tla": "WHU",
                "crest": "https://crests.football-data.org/563.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416200,
            "utcDate": "2023-01-04T20:00:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:13Z",
            "homeTeam": {
                "id": 354,
                "name": "Crystal Palace FC",
                "shortName": "Crystal Palace",
                "tla": "CRY",
                "crest": "https://crests.football-data.org/354.png"
            },
            "awayTeam": {
                "id": 73,
                "name": "Tottenham Hotspur FC",
                "shortName": "Tottenham",
                "tla": "TOT",
                "crest": "https://crests.football-data.org/73.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416203,
            "utcDate": "2023-01-04T20:00:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:13Z",
            "homeTeam": {
                "id": 58,
                "name": "Aston Villa FC",
                "shortName": "Aston Villa",
                "tla": "AVL",
                "crest": "https://crests.football-data.org/58.png"
            },
            "awayTeam": {
                "id": 76,
                "name": "Wolverhampton Wanderers FC",
                "shortName": "Wolverhampton",
                "tla": "WOL",
                "crest": "https://crests.football-data.org/76.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416201,
            "utcDate": "2023-01-05T20:00:00Z",
            "status": "TIMED",
            "matchday": 19,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-10-25T00:20:13Z",
            "homeTeam": {
                "id": 61,
                "name": "Chelsea FC",
                "shortName": "Chelsea",
                "tla": "CHE",
                "crest": "https://crests.football-data.org/61.png"
            },
            "awayTeam": {
                "id": 65,
                "name": "Manchester City FC",
                "shortName": "Man City",
                "tla": "MCI",
                "crest": "https://crests.football-data.org/65.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416185,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 76,
                "name": "Wolverhampton Wanderers FC",
                "shortName": "Wolverhampton",
                "tla": "WOL",
                "crest": "https://crests.football-data.org/76.svg"
            },
            "awayTeam": {
                "id": 563,
                "name": "West Ham United FC",
                "shortName": "West Ham",
                "tla": "WHU",
                "crest": "https://crests.football-data.org/563.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416186,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 73,
                "name": "Tottenham Hotspur FC",
                "shortName": "Tottenham",
                "tla": "TOT",
                "crest": "https://crests.football-data.org/73.svg"
            },
            "awayTeam": {
                "id": 57,
                "name": "Arsenal FC",
                "shortName": "Arsenal",
                "tla": "ARS",
                "crest": "https://crests.football-data.org/57.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416187,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 351,
                "name": "Nottingham Forest FC",
                "shortName": "Nottingham",
                "tla": "NOT",
                "crest": "https://crests.football-data.org/351.png"
            },
            "awayTeam": {
                "id": 338,
                "name": "Leicester City FC",
                "shortName": "Leicester City",
                "tla": "LEI",
                "crest": "https://crests.football-data.org/338.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416188,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 67,
                "name": "Newcastle United FC",
                "shortName": "Newcastle",
                "tla": "NEW",
                "crest": "https://crests.football-data.org/67.png"
            },
            "awayTeam": {
                "id": 63,
                "name": "Fulham FC",
                "shortName": "Fulham",
                "tla": "FUL",
                "crest": "https://crests.football-data.org/63.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416189,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 66,
                "name": "Manchester United FC",
                "shortName": "Man United",
                "tla": "MUN",
                "crest": "https://crests.football-data.org/66.png"
            },
            "awayTeam": {
                "id": 65,
                "name": "Manchester City FC",
                "shortName": "Man City",
                "tla": "MCI",
                "crest": "https://crests.football-data.org/65.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416190,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:37Z",
            "homeTeam": {
                "id": 62,
                "name": "Everton FC",
                "shortName": "Everton",
                "tla": "EVE",
                "crest": "https://crests.football-data.org/62.png"
            },
            "awayTeam": {
                "id": 340,
                "name": "Southampton FC",
                "shortName": "Southampton",
                "tla": "SOU",
                "crest": "https://crests.football-data.org/340.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416191,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:37Z",
            "homeTeam": {
                "id": 61,
                "name": "Chelsea FC",
                "shortName": "Chelsea",
                "tla": "CHE",
                "crest": "https://crests.football-data.org/61.png"
            },
            "awayTeam": {
                "id": 354,
                "name": "Crystal Palace FC",
                "shortName": "Crystal Palace",
                "tla": "CRY",
                "crest": "https://crests.football-data.org/354.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416192,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:37Z",
            "homeTeam": {
                "id": 397,
                "name": "Brighton & Hove Albion FC",
                "shortName": "Brighton Hove",
                "tla": "BHA",
                "crest": "https://crests.football-data.org/397.svg"
            },
            "awayTeam": {
                "id": 64,
                "name": "Liverpool FC",
                "shortName": "Liverpool",
                "tla": "LIV",
                "crest": "https://crests.football-data.org/64.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416193,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:37Z",
            "homeTeam": {
                "id": 402,
                "name": "Brentford FC",
                "shortName": "Brentford",
                "tla": "BRE",
                "crest": "https://crests.football-data.org/402.png"
            },
            "awayTeam": {
                "id": 1044,
                "name": "AFC Bournemouth",
                "shortName": "Bournemouth",
                "tla": "BOU",
                "crest": "https://crests.football-data.org/1044.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416194,
            "utcDate": "2023-01-14T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 20,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:37Z",
            "homeTeam": {
                "id": 58,
                "name": "Aston Villa FC",
                "shortName": "Aston Villa",
                "tla": "AVL",
                "crest": "https://crests.football-data.org/58.png"
            },
            "awayTeam": {
                "id": 341,
                "name": "Leeds United FC",
                "shortName": "Leeds United",
                "tla": "LEE",
                "crest": "https://crests.football-data.org/341.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416175,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:35Z",
            "homeTeam": {
                "id": 563,
                "name": "West Ham United FC",
                "shortName": "West Ham",
                "tla": "WHU",
                "crest": "https://crests.football-data.org/563.png"
            },
            "awayTeam": {
                "id": 62,
                "name": "Everton FC",
                "shortName": "Everton",
                "tla": "EVE",
                "crest": "https://crests.football-data.org/62.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416176,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:35Z",
            "homeTeam": {
                "id": 340,
                "name": "Southampton FC",
                "shortName": "Southampton",
                "tla": "SOU",
                "crest": "https://crests.football-data.org/340.png"
            },
            "awayTeam": {
                "id": 58,
                "name": "Aston Villa FC",
                "shortName": "Aston Villa",
                "tla": "AVL",
                "crest": "https://crests.football-data.org/58.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416177,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:35Z",
            "homeTeam": {
                "id": 65,
                "name": "Manchester City FC",
                "shortName": "Man City",
                "tla": "MCI",
                "crest": "https://crests.football-data.org/65.png"
            },
            "awayTeam": {
                "id": 76,
                "name": "Wolverhampton Wanderers FC",
                "shortName": "Wolverhampton",
                "tla": "WOL",
                "crest": "https://crests.football-data.org/76.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416178,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:35Z",
            "homeTeam": {
                "id": 64,
                "name": "Liverpool FC",
                "shortName": "Liverpool",
                "tla": "LIV",
                "crest": "https://crests.football-data.org/64.png"
            },
            "awayTeam": {
                "id": 61,
                "name": "Chelsea FC",
                "shortName": "Chelsea",
                "tla": "CHE",
                "crest": "https://crests.football-data.org/61.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416179,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:35Z",
            "homeTeam": {
                "id": 338,
                "name": "Leicester City FC",
                "shortName": "Leicester City",
                "tla": "LEI",
                "crest": "https://crests.football-data.org/338.png"
            },
            "awayTeam": {
                "id": 397,
                "name": "Brighton & Hove Albion FC",
                "shortName": "Brighton Hove",
                "tla": "BHA",
                "crest": "https://crests.football-data.org/397.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416180,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 341,
                "name": "Leeds United FC",
                "shortName": "Leeds United",
                "tla": "LEE",
                "crest": "https://crests.football-data.org/341.png"
            },
            "awayTeam": {
                "id": 402,
                "name": "Brentford FC",
                "shortName": "Brentford",
                "tla": "BRE",
                "crest": "https://crests.football-data.org/402.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416181,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 63,
                "name": "Fulham FC",
                "shortName": "Fulham",
                "tla": "FUL",
                "crest": "https://crests.football-data.org/63.svg"
            },
            "awayTeam": {
                "id": 73,
                "name": "Tottenham Hotspur FC",
                "shortName": "Tottenham",
                "tla": "TOT",
                "crest": "https://crests.football-data.org/73.svg"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416182,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 354,
                "name": "Crystal Palace FC",
                "shortName": "Crystal Palace",
                "tla": "CRY",
                "crest": "https://crests.football-data.org/354.png"
            },
            "awayTeam": {
                "id": 67,
                "name": "Newcastle United FC",
                "shortName": "Newcastle",
                "tla": "NEW",
                "crest": "https://crests.football-data.org/67.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416183,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 1044,
                "name": "AFC Bournemouth",
                "shortName": "Bournemouth",
                "tla": "BOU",
                "crest": "https://crests.football-data.org/1044.png"
            },
            "awayTeam": {
                "id": 351,
                "name": "Nottingham Forest FC",
                "shortName": "Nottingham",
                "tla": "NOT",
                "crest": "https://crests.football-data.org/351.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        },
        {
            "area": {
                "id": 2072,
                "name": "England",
                "code": "ENG",
                "flag": "https://crests.football-data.org/770.svg"
            },
            "competition": {
                "id": 2021,
                "name": "Premier League",
                "code": "PL",
                "type": "LEAGUE",
                "emblem": "https://crests.football-data.org/PL.png"
            },
            "season": {
                "id": 1490,
                "startDate": "2022-08-05",
                "endDate": "2023-05-28",
                "currentMatchday": 17,
                "winner": null
            },
            "id": 416184,
            "utcDate": "2023-01-21T15:00:00Z",
            "status": "SCHEDULED",
            "matchday": 21,
            "stage": "REGULAR_SEASON",
            "group": null,
            "lastUpdated": "2022-06-16T15:49:36Z",
            "homeTeam": {
                "id": 57,
                "name": "Arsenal FC",
                "shortName": "Arsenal",
                "tla": "ARS",
                "crest": "https://crests.football-data.org/57.png"
            },
            "awayTeam": {
                "id": 66,
                "name": "Manchester United FC",
                "shortName": "Man United",
                "tla": "MUN",
                "crest": "https://crests.football-data.org/66.png"
            },
            "score": {
                "winner": null,
                "duration": "REGULAR",
                "fullTime": {
                    "home": null,
                    "away": null
                },
                "halfTime": {
                    "home": null,
                    "away": null
                }
            },
            "odds": {
                "msg": "Activate Odds-Package in User-Panel to retrieve odds."
            },
            "referees": []
        }
    ]
} 
""".trimIndent()