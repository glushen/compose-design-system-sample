package online.arapov.dsystems.component.promo_block

import androidx.compose.runtime.Composable
import javax.inject.Qualifier

@Qualifier
annotation class OuterDependencyComposable

typealias OuterDependency = @Composable () -> Unit
