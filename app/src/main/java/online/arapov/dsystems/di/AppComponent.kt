package online.arapov.dsystems.di

import com.squareup.anvil.annotations.MergeComponent
import online.arapov.dsystems.MainActivity
import online.arapov.dsystems.core.di.AppScope
import javax.inject.Singleton

@Singleton
@MergeComponent(AppScope::class)
interface AppComponent {

    fun inject(activity: MainActivity)
}