package com.example.skydunk.services.models

import com.example.skydunk.repositories.DTOs.TeamInterface
import com.example.skydunk.services.constances.ConferenceType

class Team(
    val id: Int,
    val abbreviation: String,
    val city: String,
    val conference: ConferenceType,
    val division: String,
    val fullName: String,
    val name: String
) {
    constructor(team: TeamInterface) : this(
        id = team.id,
        abbreviation = team.abbreviation,
        city = team.city,
        conference = team.conference,
        division = team.division,
        fullName = team.fullName,
        name = team.name
    )
}