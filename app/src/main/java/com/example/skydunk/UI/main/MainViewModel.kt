package com.example.skydunk.UI.main

import com.example.skydunk.repositories.GameRepository
import com.example.skydunk.services.GameService
import com.example.skydunk.services.models.Game
import com.example.skydunk.system.Observable

class MainViewModel {
    val gameService = GameService(GameRepository())
    var name = Observable("Boston Celtics")
    var lastGame: Observable<Game?> = Observable(null)

    init {
        gameService.getGames().bind {
            val game = it.firstOrNull()
            if (game != null) {
                lastGame.value = game
            }
        }
    }
}