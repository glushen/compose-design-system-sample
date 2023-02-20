package online.arapov.dsystems.ui.test

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Stable
class ColorScheme(
    primary: Color,
    onPrimary: Color
) {
    var primary: Color by mutableStateOf(primary)
        internal set
    var onPrimary: Color by mutableStateOf(onPrimary)
        internal set
}

internal val LocalColorToken = compositionLocalOf { ColorScheme(Color.White, Color.Black) }

object TestTheme {
    val colors: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorToken.current
}

@Composable
fun TestTheme(
    colorToken: ColorScheme = TestTheme.colors,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        online.arapov.dsystems.ui.test2.LocalColorToken provides colorToken
    ) {
        content()
    }
}

@Composable
fun Component(
    colors: ComponentColor = ComponentDefaults.colors(),
    content: @Composable () -> Unit
) {
    // Use colors...
}

object ComponentDefaults {
    @Composable
    fun colors(
        backgroundColor: Color = TestTheme.colors.primary,
        contentColor: Color = TestTheme.colors.onPrimary
    ): ComponentColor {
        return ComponentColor(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }
}

@Immutable
data class ComponentColor(
    val backgroundColor: Color,
    val contentColor: Color
)

@Composable
fun Screen() {
    TestTheme {
        Component {
            // content
        }
        TestTheme(
            colorToken = // переопределяем цвета
        ) {
            Component {
                // content с другими цветами
            }
        }
    }
}