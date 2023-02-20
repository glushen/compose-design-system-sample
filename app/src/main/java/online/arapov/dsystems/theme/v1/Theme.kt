package online.arapov.dsystems.theme.v1

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.DefaultStyles
import online.arapov.dsystems.core.DefaultStylesTheme
import online.arapov.dsystems.core.styles.ButtonStyle

@Composable
fun MaterialTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDark) darkColors() else lightColors()
    CompositionLocalProvider(
        LocalMaterialColor provides colors
    ) {
        DefaultStylesTheme(
            defaultStyles = MaterialTheme.defaultStyles(),
            content = content
        )
    }
}


object MaterialTheme : BaseTheme {

    private val defaultStyles = object : DefaultStyles {
        @Composable
        override fun buttonStyle(): ButtonStyle = MaterialButtonStyles.default()
    }

    val colors: MaterialColors
        @Composable
        @ReadOnlyComposable
        get() = LocalMaterialColor.current

    val buttonStyles: MaterialButtonStyles = MaterialButtonStyles

    @Composable
    @ReadOnlyComposable
    override fun defaultStyles(): DefaultStyles {
        return defaultStyles
    }
}