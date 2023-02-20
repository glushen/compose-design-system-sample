package online.arapov.dsystems.core.component

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf

@Immutable
interface ButtonStyle

val LocalButtonStyle = staticCompositionLocalOf<ButtonStyle> {
    throw IllegalStateException("default style not implemented")
}