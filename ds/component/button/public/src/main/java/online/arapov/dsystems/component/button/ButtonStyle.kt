package online.arapov.dsystems.component.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import online.arapov.dsystems.core.ThemeColor

@Immutable
data class ButtonStyle(
    val textStyle: TextStyle,
    val contentColor: ThemeColor,
    val backgroundColor: ThemeColor,
    val pressedColor: ThemeColor,
    val disabledBackgroundColor: ThemeColor,
    val disabledContentColor: ThemeColor,
    val elevation: Dp,
    val shape: Shape,
    val horizontalPadding: Dp,
    val minHeight: Dp,
    val minWidth: Dp,
    val iconPadding: Dp,
    val iconSize: Dp,
) {
    @Composable
    fun backgroundColor(enabled: Boolean): State<ThemeColor> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    fun contentColor(enabled: Boolean): State<ThemeColor> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }
}