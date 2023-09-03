package com.example.skydunk.system

class Observable<T>(value: T) {
    private var listeners = mutableListOf<(T) -> Unit>()
    var value: T = value
        set(value) {
            listeners.forEach {
                it(value)
            }
        }

    fun bind(listener: (T) -> Unit) {
        listener(value)
        listeners.add(listener)
    }
}