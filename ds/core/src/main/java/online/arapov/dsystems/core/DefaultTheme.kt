package online.arapov.dsystems.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.isSpecified

@Composable
fun DefaultTheme(
    theme: BaseTheme,
    backgroundColor: Color = Color.Unspecified,
    contentColor: Color = LocalContentColor.current,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalContentColor provides contentColor
    ) {
        CompositionLocalProvider(*theme.localProviders()) {
            if (backgroundColor.isSpecified) {
                Box(Modifier.background(backgroundColor)) {
                    content()
                }
            } else {
                content()
            }
        }
    }
}