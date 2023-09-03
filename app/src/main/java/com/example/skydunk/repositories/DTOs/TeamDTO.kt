package com.example.skydunk.repositories.DTOs

import com.example.skydunk.services.constances.ConferenceType

interface TeamInterface {
    val id: Int
    val abbreviation: String
    val city: String
    val conference: ConferenceType
    val division: String
    val fullName: String
    val name: String
}

data class TeamDTO(
    override val id: Int,
    override val abbreviation: String,
    override val city: String,
    override val conference: ConferenceType,
    override val division: String,
    override val fullName: String,
    override val name: String
) : TeamInterface