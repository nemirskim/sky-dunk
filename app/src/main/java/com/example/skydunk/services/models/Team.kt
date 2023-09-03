package com.example.skydunk.services.models

import com.example.skydunk.services.constances.ConferenceType

data class Team(
    val id: Int,
    val abbreviation: String,
    val city: String,
    val conference: ConferenceType,
    val division: String,
    val fullName: String,
    val name: String
)