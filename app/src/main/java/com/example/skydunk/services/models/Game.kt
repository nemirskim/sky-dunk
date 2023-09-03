package com.example.skydunk.services.models

import java.util.Date

class Game (
    val id: Int,
    val date: Date,
    val season: Int,
    val homeTeam: Team,
    val visitorTeam: Team,
    val homeTeamScore: Int,
    val visitorTeamScore: Int
)
