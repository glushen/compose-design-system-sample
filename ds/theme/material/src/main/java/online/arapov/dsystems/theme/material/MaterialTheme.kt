package online.arapov.dsystems.theme.material

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import online.arapov.dsystems.core.DefaultTheme
import online.arapov.dsystems.theme.alnf.AlnfTheme
import online.arapov.dsystems.theme.material.compat.AlnfButtonMaterialCompat
import online.arapov.dsystems.theme.material.gen.LocalMaterialColor
import online.arapov.dsystems.theme.material.gen.MaterialTheme
import online.arapov.dsystems.theme.material.gen.darkColors
import online.arapov.dsystems.theme.material.gen.lightColors
import online.arapov.dsystems.theme.material.gen.style.LocalButtonMaterialStyles

@Composable
fun MaterialTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDark) darkColors() else lightColors()
    CompositionLocalProvider(
        LocalMaterialColor provides colors
    ) {
        DefaultTheme(
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