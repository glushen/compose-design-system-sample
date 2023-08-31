package online.arapov.dsystems.component.promo_block

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import javax.inject.Qualifier

@Qualifier
annotation class PromoBlockComposable

typealias PromoBlock = @Composable (
    style: PromoBlockStyle,
    modifier: Modifier
) -> Unit
