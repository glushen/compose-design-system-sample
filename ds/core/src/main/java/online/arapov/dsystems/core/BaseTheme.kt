package online.arapov.dsystems.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.ReadOnlyComposable

@Immutable
interface BaseTheme {
    @Composable
    @ReadOnlyComposable
    fun localProviders(): Array<ProvidedValue<*>> = emptyArray()
}