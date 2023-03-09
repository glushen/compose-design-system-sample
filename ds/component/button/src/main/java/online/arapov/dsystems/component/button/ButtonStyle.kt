package online.arapov.dsystems.component.button

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

@Immutable
data class ButtonStyle(
    val textStyle: TextStyle,
    val contentColor: Color,
    val backgroundColor: Color,
    val pressedColor: Color,
    val disabledBackgroundColor: Color,
    val disabledContentColor: Color,
    val elevation: Dp,
    val shape: Shape,
    val horizontalPadding: Dp,
    val minHeight: Dp,
    val minWidth: Dp,
    val iconPadding: Dp,
    val iconSize: Dp,
) {
    @Composable
    fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }
}