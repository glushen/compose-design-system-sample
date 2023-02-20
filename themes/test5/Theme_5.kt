package online.arapov.dsystems.ui.test5

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
    backgroundColor: Color,
    contentColor: Color,
    content:  @Composable () -> Unit
) {
    // colours and content
}

@Composable
fun Component(
    text: String,
    style: TestComponentStyle = TestComponentDefaults.style(),
) {
    Component(
        backgroundColor = style.backgroundColor,
        contentColor = style.contentColor
    ) {
        // content
    }
}

object TestComponentDefaults {
    @Composable
    fun style(
        backgroundColor: Color = TestTheme.colors.primary,
        contentColor: Color = TestTheme.colors.onPrimary
    ): TestComponentStyle {
        return TestComponentStyle(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }
}

@Immutable
data class TestComponentStyle(
    val backgroundColor: Color,
    val contentColor: Color
)

@Composable
fun Screen() {
    TestTheme {
        Component("Test")

        TestTheme(
            colorScheme = // переопределяем цвета
        ) {
            Component("Test")
        }
    }
}