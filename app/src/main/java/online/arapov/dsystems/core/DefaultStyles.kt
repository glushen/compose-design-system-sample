package online.arapov.dsystems.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.core.styles.LocalButtonStyle

interface DefaultStyles {
    @Composable
    fun buttonStyle(): ButtonStyle
}

@Composable
fun DefaultStylesTheme(
    defaultStyles: DefaultStyles,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalButtonStyle provides defaultStyles.buttonStyle(),
        content = content
    )
}