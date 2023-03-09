package online.arapov.dsystems.component.promo_block

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import online.arapov.dsystems.component.button.ButtonStyle
import online.arapov.dsystems.core.BaseTheme

@Immutable
interface PromoBlockStyle {
    val primaryButtonStyle: ButtonStyle
    val secondaryButtonStyle: ButtonStyle
    val backgroundColor: Color
    val shape: Shape
    fun theme(): BaseTheme
}