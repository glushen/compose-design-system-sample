package online.arapov.dsystems.component.promo_block

import androidx.compose.runtime.Composable
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import online.arapov.dsystems.core.di.AppScope

@Composable
fun OuterDependencyImpl() {

}

@ContributesTo(AppScope::class)
@Module
object OuterDependencyModule {
    @Provides
    @OuterDependencyComposable
    fun provideOuterDependency() : OuterDependency {
        return {
            OuterDependencyImpl()
        }
    }
}
