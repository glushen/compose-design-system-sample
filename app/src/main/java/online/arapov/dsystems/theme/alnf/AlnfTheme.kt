package online.arapov.dsystems.theme.alnf

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
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDark) darkColors() else lightColors()
    CompositionLocalProvider(
        LocalAlnfColor provides colors
    ) {
        DefaultStylesTheme(
            defaultStyles = AlnfTheme.defaultStyles(),
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
        get() = DefaultButtonAlnfStyles

    private val defaultStyles = object : DefaultStyles {
        @Composable
        override fun buttonStyle(): ButtonStyle = buttonStyles.default()
    }

    @Composable
    @ReadOnlyComposable
    override fun defaultStyles(): DefaultStyles {
        return defaultStyles
    }
}