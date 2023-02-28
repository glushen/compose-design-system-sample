package online.arapov.dsystems.theme.material

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.core.DefaultStylesTheme
import online.arapov.dsystems.theme.alnf.AlnfTheme
import online.arapov.dsystems.theme.material.compat.AlnfButtonMaterialCompat

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
            theme = MaterialTheme,
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
    if (isCompatModeEnabled) {
        CompositionLocalProvider(
            LocalButtonMaterialStyles provides AlnfButtonMaterialCompat
        ) {
            MaterialTheme(
                isDark = isDark
            ) {
                AlnfTheme(
                    isDark = isDark,
                    content = content
                )
            }
        }
    } else {
        MaterialTheme(
            isDark = isDark,
            content = content
        )
    }
}

object MaterialTheme : BaseTheme {

    val colors: MaterialColors
        @Composable
        @ReadOnlyComposable
        get() = LocalMaterialColor.current

    val buttonStyles: ButtonMaterialStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalButtonMaterialStyles.current

    val promoBlockStyles: PromoBlockMaterialStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalPromoBlockMaterialStyles.current
}