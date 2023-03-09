package online.arapov.dsystems.theme.alnf

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import online.arapov.dsystems.core.DefaultTheme
import online.arapov.dsystems.theme.alnf.gen.LocalAlnfColor
import online.arapov.dsystems.theme.alnf.gen.darkColors
import online.arapov.dsystems.theme.alnf.gen.lightColors
import online.arapov.dsystems.theme.alnf.gen.AlnfTheme

@Composable
fun AlnfTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDark) darkColors() else lightColors()
    CompositionLocalProvider(
        LocalAlnfColor provides colors
    ) {
        DefaultTheme(
            theme = AlnfTheme,
            backgroundColor = AlnfTheme.colors.background,
            contentColor = AlnfTheme.colors.content,
            content = content
        )
    }
}