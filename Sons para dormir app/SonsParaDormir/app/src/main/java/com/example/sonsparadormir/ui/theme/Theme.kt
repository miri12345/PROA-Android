package com.example.sonsparadormir.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
/*
private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)*/

private val LightColors = lightColorScheme(
    primary = CherryBlossomPink,
    secondary = ChampagnePink,
    tertiary = MountBattenPink,

    // Cores de fundo e superfície
    background = ChampagnePink,
    surface = Thistle,

    // Texto
    onPrimary = MountBattenPink,
    onSecondary = Pink,
    onBackground = MountBattenPink,
    onSurface = UranianBlue
)

private val DarkColors = darkColorScheme(
    primary = CherryBlossomPink,
    secondary = LightSkyBlue,
    tertiary = MountBattenPink,

    // Cores de fundo e superfície
    background = MountBattenPink,
    surface = Thistle,

    // Texto
    onPrimary = UranianBlue,
    onSecondary = Pink,
    onBackground = LightSkyBlue,
    onSurface = Thistle
)


@Composable
fun SonsParaDormirTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColors
        else -> LightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}