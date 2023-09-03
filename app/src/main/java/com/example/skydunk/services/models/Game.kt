package com.example.skydunk.services.models

import com.example.skydunk.repositories.DTOs.GameInterface
import java.util.Date

class Game(
    val id: Int,
    val date: Date,
    val season: Int,
    val homeTeam: Team,
    val visitorTeam: Team,
    val homeTeamScore: Int,
    val visitorTeamScore: Int
) {
    constructor(game: GameInterface) : this(
        id = game.id,
        date = game.date,
        season = game.season,
        homeTeam = Team(game.homeTeam),
        visitorTeam = Team(game.visitorTeam),
        homeTeamScore = game.homeTeamScore,
        visitorTeamScore = game.visitorTeamScore
    )
}
