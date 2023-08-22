package online.arapov.dsystems.component.promo_block

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PromoBlock(
    delegate: PromoBlockDelegate,
    style: PromoBlockStyle,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    delegate(style, modifier, content)
}

interface PromoBlockDelegate {

    @Composable
    operator fun invoke(
        style: PromoBlockStyle,
        modifier: Modifier,
        content: @Composable BoxScope.() -> Unit
    )
}