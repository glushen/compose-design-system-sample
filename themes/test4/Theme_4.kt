package online.arapov.dsystems.ui.test4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
object ColorToken {
    val white: Color = Color.White
    val black: Color = Color.Black
}

class ComponentStyles {
    fun default() = ComponentStyle(
        backgroundColor = ColorToken.white,
        contentColor = ColorToken.black
    )
}

object TestTheme {
    val componentStyles: ComponentStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalComponentStyles.current
}

val LocalComponentStyles = staticCompositionLocalOf { ComponentStyles() }


@Composable
fun Component(
    style: ComponentStyle = TestTheme.componentStyles.default(),
    content: @Composable () -> Unit
) {
    // Use style...
}

@Immutable
data class ComponentStyle(
    val backgroundColor: Color,
    val contentColor: Color
)

@Composable
fun Screen() {
    Component {
        // content
    }

    Component(
        style = ComponentStyle(/* другие цвета */)
    ) {
        // content
    }
}