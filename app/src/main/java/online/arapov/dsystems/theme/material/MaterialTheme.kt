package online.arapov.dsystems.theme.material

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.*
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.DefaultStyles
import online.arapov.dsystems.core.DefaultStylesTheme
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.theme.material.compat.AlnfButtonMaterialCompat
import online.arapov.dsystems.theme.alnf.AlnfTheme

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
            backgroundColor = MaterialTheme.colors.white,
            contentColor = MaterialTheme.colors.black,
            content = content
        )
    }
}

@Composable
fun MaterialTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    isCompatModeEnabled: Boolean = false,
    content: @Composable () -> Unit
) {
    MaterialTheme.isCompatModeEnabled = isCompatModeEnabled
    if (isCompatModeEnabled) {
        MaterialTheme(
            isDark = isDark
        ) {
            AlnfTheme(
                isDark = isDark,
                content = content
            )
        }
    } else {
        MaterialTheme(
            isDark = isDark,
            content = content
        )
    }
}

object MaterialTheme : BaseTheme {

    internal var isCompatModeEnabled by mutableStateOf(false)

    val colors: MaterialColors
        @Composable
        @ReadOnlyComposable
        get() = LocalMaterialColor.current

    val buttonStyles: ButtonMaterialStyles
        @Composable
        @ReadOnlyComposable
        get() = if (isCompatModeEnabled) AlnfButtonMaterialCompat else DefaultButtonMaterialStyles

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