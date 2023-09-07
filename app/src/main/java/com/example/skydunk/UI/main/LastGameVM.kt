package com.example.skydunk.UI.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.skydunk.services.models.Game
import java.util.Date
import kotlin.properties.Delegates

open class LastGameVM() : ViewModel() {
    private var id by Delegates.notNull<Int>()
    val date: MutableLiveData<Date> by lazy {
        MutableLiveData<Date>()
    }
    val score: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val homeTeamLogo: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val visitorTeamLogo: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun bind(game: Game) {
        id = game.id
        date.value = game.date
        score.value = "${game.homeTeamScore} : ${game.visitorTeamScore}"
        homeTeamLogo.value = game.homeTeam.abbreviation.lowercase()
        visitorTeamLogo.value = game.visitorTeam.abbreviation.lowercase()
    }
}