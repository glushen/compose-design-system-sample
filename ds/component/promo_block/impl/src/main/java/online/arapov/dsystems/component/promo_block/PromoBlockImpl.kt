package online.arapov.dsystems.component.promo_block

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import online.arapov.dsystems.core.DefaultTheme
import online.arapov.dsystems.core.di.AppScope

@Composable
fun PromoBlockImpl(
    outerDependency: OuterDependency,
    style: PromoBlockStyle,
    modifier: Modifier
) {
    DefaultTheme(theme = style.theme()) {
        Box(
            modifier = modifier
                .background(style.backgroundColor(), style.shape)
                .padding(8.dp)
        ) {
            outerDependency()
        }
    }
}

@ContributesTo(AppScope::class)
@Module
object PromoBlockModule {
    @Provides
    @PromoBlockComposable
    fun providePromoBlock(
        @OuterDependencyComposable outerDependency: OuterDependency
    ) : PromoBlock {
        return { style, modifier ->
            PromoBlockImpl(
                outerDependency,
                style,
                modifier
            )
        }
    }
}
