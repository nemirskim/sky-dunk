package com.example.skydunk.repositories

import android.os.Handler
import android.os.Looper
import com.example.skydunk.repositories.DTOs.GameDTO
import com.example.skydunk.repositories.DTOs.GameInterface
import com.example.skydunk.repositories.DTOs.TeamDTO
import com.example.skydunk.services.constances.ConferenceType
import com.example.skydunk.system.Observable
import java.util.Date

interface GameRepositoryInterface {
    fun getGames(): Observable<Array<GameInterface>>
}

class GameRepository : GameRepositoryInterface {
    private var handler = Handler(Looper.getMainLooper())

    override fun getGames(): Observable<Array<GameInterface>> {
        var games = Observable<Array<GameInterface>>(emptyArray())

        handler.postDelayed({
            games.value = arrayOf(
                GameDTO(
                    id = 4234,
                    date = Date(),
                    season = 2021,
                    homeTeam = TeamDTO(
                        id = 54,
                        abbreviation = "BOS",
                        city = "Dallas",
                        conference = ConferenceType.WEST,
                        division = "",
                        fullName = "Dallas Mavericks",
                        name = "Mavericks"
                    ),
                    visitorTeam = TeamDTO(
                        id = 19,
                        abbreviation = "GSW",
                        city = "Toronto",
                        conference = ConferenceType.WEST,
                        division = "",
                        fullName = "Toronto Raptors",
                        name = "Raptors"
                    ),
                    homeTeamScore = 121,
                    visitorTeamScore = 119
                )
            )
        }, 3500)

        return games
    }
}