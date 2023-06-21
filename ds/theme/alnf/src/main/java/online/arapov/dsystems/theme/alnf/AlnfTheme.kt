package online.arapov.dsystems.theme.alnf

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import online.arapov.dsystems.core.DefaultTheme
import online.arapov.dsystems.core.LocalThemeDark
import online.arapov.dsystems.theme.alnf.gen.AlnfTheme

@Composable
fun AlnfTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val rippleIndication = rememberRipple()
    CompositionLocalProvider(
        LocalIndication provides rippleIndication,
        LocalThemeDark provides isDark
    ) {
        DefaultTheme(
            theme = AlnfTheme,
            backgroundColor = AlnfTheme.colors.background(),
            contentColor = AlnfTheme.colors.content(),
            content = content
        )
    }
}