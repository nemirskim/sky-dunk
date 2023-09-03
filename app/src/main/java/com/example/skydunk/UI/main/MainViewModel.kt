package com.example.skydunk.UI.main

import com.example.skydunk.repositories.GameRepository
import com.example.skydunk.services.GameService
import com.example.skydunk.system.Observable

class MainViewModel {
    val gameService = GameService(GameRepository())
    var name = Observable("Boston Celtics")

    init {
        gameService.getGames().bind {
            var game = it.firstOrNull()
            if (game != null) {
                name.value = game.homeTeam.fullName
            }
        }
    }
}