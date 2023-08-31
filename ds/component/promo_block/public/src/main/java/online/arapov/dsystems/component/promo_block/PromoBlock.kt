package online.arapov.dsystems.component.promo_block

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

typealias PromoBlockType = @Composable (
    style: PromoBlockStyle,
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit
) -> Unit

@Composable
fun PromoBlock(
    delegate: PromoBlockType,
    style: PromoBlockStyle,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) = delegate(
    style,
    modifier,
    content
)

interface PromoBlockDelegateHolder {
    val delegate: PromoBlockType
}
