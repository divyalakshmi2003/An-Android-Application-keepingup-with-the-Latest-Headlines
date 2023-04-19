package com.example.newsheadlines.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.newsheadlines.ui.theme.Shapes
import kotlin.text.Typography as TextTypography


private val DarkColorPalette = darkColors(
    primary = Color.Magenta,
    primaryVariant = Color.Magenta,
    secondary = Color.Red
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun NewsHeadlinesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = (if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }).also {

        MaterialTheme(
            colors = it,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}