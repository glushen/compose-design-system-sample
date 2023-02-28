package online.arapov.dsystems.core.styles

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import online.arapov.dsystems.core.BaseTheme

@Immutable
interface PromoBlockStyle {
    val primaryButtonStyle: ButtonStyle
    val secondaryButtonStyle: ButtonStyle
    val backgroundColor: Color
    val shape: Shape
    fun theme(): BaseTheme
}