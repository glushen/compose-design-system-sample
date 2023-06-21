package online.arapov.dsystems.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

data class ThemeColor(
    private val light: Color,
    private val dark: Color
) {
    constructor(color: Color) : this(color, color)

    @Composable
    operator fun invoke(): Color {
        return when (LocalThemeDark.current) {
            true -> dark
            false -> light
        }
    }
}