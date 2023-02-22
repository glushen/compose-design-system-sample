package online.arapov.dsystems.theme.alnf

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.DefaultStyles
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.core.styles.PromoBlockStyle


internal data class PromoBlockStyleImpl(
    override val primaryButtonStyle: ButtonStyle,
    override val secondaryButtonStyle: ButtonStyle,
    override val backgroundColor: Color,
    override val shape: Shape
) : PromoBlockStyle {
    private val theme = PromoBlockTheme(this)
    override fun theme(): BaseTheme = theme
}

private data class PromoBlockTheme(
    val style: PromoBlockStyleImpl
) : BaseTheme {
    private val defaultPromoBlockStyles = DefaultPromoBlockStyles(style)

    @Composable
    @ReadOnlyComposable
    override fun defaultStyles(): DefaultStyles {
        return defaultPromoBlockStyles
    }

    private val promoBlockButtonStyles = PromoBlockButtonStyles(style)

    @Composable
    @ReadOnlyComposable
    override fun localProviders(): List<ProvidedValue<*>> {
        return listOf(
            LocalButtonAlnfStyles provides promoBlockButtonStyles
        )
    }
}

private data class DefaultPromoBlockStyles(
    val style: PromoBlockStyleImpl
) : DefaultStyles by DefaultStylesAlnf {
    @Composable
    @ReadOnlyComposable
    override fun buttonStyle(): ButtonStyle {
        return style.primaryButtonStyle
    }
}

private data class PromoBlockButtonStyles(
    val style: PromoBlockStyleImpl
) : ButtonAlnfStyles by DefaultButtonAlnfStyles {
    override val primary: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = style.primaryButtonStyle
    override val secondary: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = style.secondaryButtonStyle
}