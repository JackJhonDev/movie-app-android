package com.jackjhondev.movieapp.core.util

import timber.log.Timber

object UtilityFunctions {

    fun logError(tag: String, message: String) {
        Timber.tag(tag).e("Error -> $message")
    }

    fun logIngo(tag: String, message: String) {
        Timber.tag(tag).e("Info -> $message")
    }
}