package com.example.skydunk.services

import com.example.skydunk.repositories.GameRepositoryInterface
import com.example.skydunk.services.models.Game
import com.example.skydunk.system.Observable

interface GameServiceInterface {
    fun getGames(): Observable<Array<Game>>
}

class GameService(network: GameRepositoryInterface) : GameServiceInterface {
    private val network: GameRepositoryInterface

    init {
        this.network = network
    }

    override fun getGames(): Observable<Array<Game>> {
        var games = Observable<Array<Game>>(emptyArray())
        val response = network.getGames()
        response.bind {
            games.value = it.map { game -> Game(game) }.toTypedArray()
        }
        return games
    }
}