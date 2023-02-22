package online.arapov.dsystems.core.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import online.arapov.dsystems.core.DefaultStylesTheme
import online.arapov.dsystems.core.styles.LocalPromoBlockStyle
import online.arapov.dsystems.core.styles.PromoBlockStyle

@Composable
fun PromoBlock(
    modifier: Modifier = Modifier,
    style: PromoBlockStyle = LocalPromoBlockStyle.current,
    content: @Composable BoxScope.() -> Unit
) {
    DefaultStylesTheme(theme = style.theme()) {
        Box(
            modifier = modifier
                .background(style.backgroundColor, style.shape)
                .padding(8.dp),
            content = content
        )
    }
}