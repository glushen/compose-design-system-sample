package online.arapov.dsystems.theme.alnf

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.DefaultStyles
import online.arapov.dsystems.core.DefaultStylesTheme
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.core.styles.PromoBlockStyle
import online.arapov.dsystems.theme.material.DefaultPromoBlockMaterialStyles
import online.arapov.dsystems.theme.material.PromoBlockMaterialStyles

@Composable
fun AlnfTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDark) darkColors() else lightColors()
    CompositionLocalProvider(
        LocalAlnfColor provides colors
    ) {
        DefaultStylesTheme(
            theme = AlnfTheme,
            backgroundColor = AlnfTheme.colors.background,
            contentColor = AlnfTheme.colors.content,
            content = content
        )
    }
}

object AlnfTheme : BaseTheme {

    val colors: AlnfColors
        @Composable
        @ReadOnlyComposable
        get() = LocalAlnfColor.current

    val buttonStyles: ButtonAlnfStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalButtonAlnfStyles.current

    val promoBlockStyles: PromoBlockAlnfStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalPromoBlockAlnfStyles.current

    @Composable
    @ReadOnlyComposable
    override fun defaultStyles(): DefaultStyles {
        return DefaultStylesAlnf
    }
}

internal object DefaultStylesAlnf : DefaultStyles {
    @Composable
    override fun buttonStyle(): ButtonStyle {
        return AlnfTheme.buttonStyles.default()
    }

    @Composable
    override fun promoBlockStyle(): PromoBlockStyle {
        return AlnfTheme.promoBlockStyles.default()
    }
}