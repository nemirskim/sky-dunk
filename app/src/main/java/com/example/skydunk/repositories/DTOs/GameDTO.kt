package com.example.skydunk.repositories.DTOs

import java.util.Date

interface GameInterface {
    val id: Int
    val date: Date
    val season: Int
    val homeTeam: TeamDTO
    val visitorTeam: TeamDTO
    val homeTeamScore: Int
    val visitorTeamScore: Int
}
class GameDTO (
    override val id: Int,
    override val date: Date,
    override val season: Int,
    override val homeTeam: TeamDTO,
    override val visitorTeam: TeamDTO,
    override val homeTeamScore: Int,
    override val visitorTeamScore: Int
) : GameInterface