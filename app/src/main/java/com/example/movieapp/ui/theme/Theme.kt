package com.example.movieapp.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColorScheme(
    primary = BlackPrimary,
    onPrimary = BlackSecondary,
)

private val LightColorPalette = lightColorScheme(
    primary = YellowSecondary,
    onPrimary = BlackSecondary,
)

@Composable
fun MovieAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}