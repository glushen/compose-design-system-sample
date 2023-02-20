package online.arapov.dsystems.ui.test2

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Stable
class ColorToken(
    val white: Color,
    val black: Color
)
internal val LocalColorToken = compositionLocalOf { ColorToken(Color.White, Color.Black) }

object TestTheme {
    val colors: ColorToken
        @Composable
        @ReadOnlyComposable
        get() = LocalColorToken.current
}

@Composable
fun TestTheme(
    colorToken: ColorToken = TestTheme.colors,
    content: @Composable TestTheme.() -> Unit
) {
    CompositionLocalProvider(
        LocalColorToken provides colorToken
    ) {
        TestTheme.content()
    }
}

@Composable
fun Component(
    style: ComponentStyle
) {
    // Use style...
}

@Immutable
data class ComponentStyle(
    val backgroundColor: Color,
    val contentColor: Color
)

@Composable
fun TestTheme.componentPrimary() = ComponentStyle(
    backgroundColor = colors.white,
    contentColor = colors.black
)


@Composable
fun Screen() {
    TestTheme {
        Component(style = componentPrimary())

        TestTheme(
            colorToken = // переопределяем цвета
        ) {
            Component(style = componentPrimary())
        }
    }
}