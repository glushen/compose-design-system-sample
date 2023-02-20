package online.arapov.dsystems.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.core.styles.LocalButtonStyle

interface DefaultStyles {
    @Composable
    fun buttonStyle(): ButtonStyle
}

@Composable
fun DefaultStylesTheme(
    defaultStyles: DefaultStyles,
    backgroundColor: Color,
    contentColor: Color,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalButtonStyle provides defaultStyles.buttonStyle(),
        LocalContentColor provides contentColor
    ) {
        Box(Modifier.background(backgroundColor)) {
            content()
        }
    }
}