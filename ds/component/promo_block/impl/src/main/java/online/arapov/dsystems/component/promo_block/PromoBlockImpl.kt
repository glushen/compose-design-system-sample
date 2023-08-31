package online.arapov.dsystems.component.promo_block

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.squareup.anvil.annotations.ContributesBinding
import online.arapov.dsystems.core.DefaultTheme
import online.arapov.dsystems.core.di.AppScope
import javax.inject.Inject

@Composable
fun PromoBlockImpl(
    style: PromoBlockStyle,
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    DefaultTheme(theme = style.theme()) {
        Box(
            modifier = modifier
                .background(style.backgroundColor(), style.shape)
                .padding(8.dp),
            content = content
        )
    }
}

@ContributesBinding(AppScope::class)
class PromoBlockDelegateHolderImpl @Inject constructor() : PromoBlockDelegateHolder {
    override val delegate: PromoBlockType = { style, modifier, content ->
        PromoBlockImpl(style, modifier, content)
    }
}