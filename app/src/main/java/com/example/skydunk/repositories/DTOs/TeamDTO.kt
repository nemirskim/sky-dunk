package com.example.skydunk.repositories.DTOs

import com.example.skydunk.services.constances.ConferenceType

data class TeamDTO(
    val id: Int,
    val abbreviation: String,
    val city: String,
    val conference: ConferenceType,
    val division: String,
    val fullName: String,
    val name: String
)