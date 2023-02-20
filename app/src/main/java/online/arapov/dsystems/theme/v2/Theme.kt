package online.arapov.dsystems.theme.v2

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.DefaultStyles
import online.arapov.dsystems.core.DefaultStylesTheme
import online.arapov.dsystems.core.styles.ButtonStyle

@Composable
fun AlnfTheme(
    defaultStyles: DefaultStyles = AlnfTheme.defaultStyles(),
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDark) darkColors() else lightColors()
    CompositionLocalProvider(
        LocalAlnfColor provides colors
    ) {
        DefaultStylesTheme(
            defaultStyles = defaultStyles,
            content = content
        )
    }
}


object AlnfTheme : BaseTheme {

    private val defaultStyles = object : DefaultStyles {
        @Composable
        override fun buttonStyle(): ButtonStyle = AlnfButtonStyles.default()
    }

    val colors: AlnfColors
        @Composable
        @ReadOnlyComposable
        get() = LocalAlnfColor.current

    val buttonStyles: AlnfButtonStyles = AlnfButtonStyles

    @Composable
    @ReadOnlyComposable
    override fun defaultStyles(): DefaultStyles {
        return defaultStyles
    }
}