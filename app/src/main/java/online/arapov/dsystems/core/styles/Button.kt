package online.arapov.dsystems.core.styles

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

@Immutable
data class ButtonStyle(
    val textStyle: TextStyle,
    val border: BorderStroke?,
    val backgroundColor: Color,
    val elevation: Dp,
    val shape: Shape,
    val horizontalPadding: Dp,
    val minHeight: Dp,
    val minWidth: Dp,
)

val LocalButtonStyle = staticCompositionLocalOf<ButtonStyle> {
    throw IllegalStateException("default style not implemented")
}