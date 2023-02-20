package online.arapov.dsystems.ui.test3

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Immutable
object ColorToken {
    val white: Color = Color.White
    val black: Color = Color.Black
}

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

internal val LocalColorScheme = compositionLocalOf {
    ColorScheme(ColorToken.white, ColorToken.black)
}

object TestTheme {
    val colors: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current
}

@Composable
fun TestTheme(
    colorScheme: ColorScheme = TestTheme.colors,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme
    ) {
        content()
    }
}

@Composable
fun Component(
    style: ComponentStyle = ComponentDefaults.style(),
    content: @Composable () -> Unit
) {
    // Use style...
}

object ComponentDefaults {
    @Composable
    fun style(
        backgroundColor: Color = TestTheme.colors.primary,
        contentColor: Color = TestTheme.colors.onPrimary
    ): ComponentStyle {
        return ComponentStyle(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }
}

@Immutable
data class ComponentStyle(
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
            colorScheme = // переопределяем цвета
        ) {
            Component {
                // content
            }
        }
    }
}