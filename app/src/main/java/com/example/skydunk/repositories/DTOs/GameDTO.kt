package com.example.skydunk.repositories.DTOs

import java.util.Date

data class GameDTO(
    val id: Int,
    val date: Date,
    val season: Int,
    val homeTeam: TeamDTO,
    val visitorTeam: TeamDTO,
    val homeTeamScore: Int,
    val visitorTeamScore: Int
)