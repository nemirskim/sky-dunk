package com.example.skydunk.UI.extensions

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.app.ActivityCompat

fun Context.getResource(name: String): Drawable? {
    val resId = this.resources.getIdentifier(name, "drawable", this.packageName)
    return ActivityCompat.getDrawable(this, resId)
}