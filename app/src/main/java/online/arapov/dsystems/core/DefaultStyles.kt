package online.arapov.dsystems.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.graphics.isUnspecified
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.core.styles.LocalButtonStyle
import online.arapov.dsystems.core.styles.LocalPromoBlockStyle
import online.arapov.dsystems.core.styles.PromoBlockStyle

interface DefaultStyles {
    @Composable
    @ReadOnlyComposable
    fun buttonStyle(): ButtonStyle

    @Composable
    @ReadOnlyComposable
    fun promoBlockStyle(): PromoBlockStyle
}

@Composable
fun DefaultStylesTheme(
    theme: BaseTheme,
    backgroundColor: Color = Color.Unspecified,
    contentColor: Color = LocalContentColor.current,
    content: @Composable () -> Unit
) {
    val defaultStyles = theme.defaultStyles()

    CompositionLocalProvider(
        LocalButtonStyle provides defaultStyles.buttonStyle(),
        LocalPromoBlockStyle provides defaultStyles.promoBlockStyle(),
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