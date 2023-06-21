package online.arapov.dsystems.theme.material.gen.style

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Shape
import online.arapov.dsystems.component.button.ButtonStyle
import online.arapov.dsystems.component.promo_block.PromoBlockStyle
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.ThemeColor

internal data class PromoBlockMaterialStyleImpl(
    override val primaryButtonStyle: ButtonStyle,
    override val secondaryButtonStyle: ButtonStyle,
    override val backgroundColor: ThemeColor,
    override val shape: Shape
) : PromoBlockStyle {
    private val theme = PromoBlockTheme(this)
    override fun theme(): BaseTheme = theme
}

private data class PromoBlockTheme(
    val style: PromoBlockMaterialStyleImpl
) : BaseTheme {
    private val promoBlockButtonStyles = PromoBlockButtonStyles(style)

    @Composable
    @ReadOnlyComposable
    override fun localProviders(): Array<ProvidedValue<*>> {
        return arrayOf(
            LocalButtonMaterialStyles provides promoBlockButtonStyles
        )
    }
}

private data class PromoBlockButtonStyles(
    val style: PromoBlockMaterialStyleImpl
) : ButtonMaterialStyles by DefaultButtonMaterialStyles {
    override val primary: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = style.primaryButtonStyle

    override val secondary: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = style.secondaryButtonStyle
}