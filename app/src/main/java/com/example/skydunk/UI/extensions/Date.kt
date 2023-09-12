package com.example.skydunk.UI.extensions

import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Date

fun Date.toSimpleDate(): String {
    val date = LocalDateTime.ofInstant(this.toInstant(), ZoneId.systemDefault())
    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    return date.format(formatter)
}