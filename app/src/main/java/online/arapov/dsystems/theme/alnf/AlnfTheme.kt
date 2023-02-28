package online.arapov.dsystems.theme.alnf

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.DefaultStylesTheme

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
}