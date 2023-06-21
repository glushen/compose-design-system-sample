package online.arapov.dsystems.component.promo_block

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape
import online.arapov.dsystems.component.button.ButtonStyle
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.ThemeColor

@Immutable
interface PromoBlockStyle {
    val primaryButtonStyle: ButtonStyle
    val secondaryButtonStyle: ButtonStyle
    val backgroundColor: ThemeColor
    val shape: Shape
    fun theme(): BaseTheme
}