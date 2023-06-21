package online.arapov.dsystems.theme.alnf.gen.style

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import online.arapov.dsystems.component.button.ButtonStyle
import online.arapov.dsystems.theme.alnf.gen.AlnfTheme

@Immutable
interface ButtonAlnfStyles {
    val primary: ButtonStyle
        @Composable
        get
    val secondary: ButtonStyle
        @Composable
        get
}

internal val LocalButtonAlnfStyles =
    staticCompositionLocalOf<ButtonAlnfStyles> { DefaultButtonAlnfStyles }

internal object DefaultButtonAlnfStyles : ButtonAlnfStyles {

    override val primary: ButtonStyle
        @Composable
        get() {
            return remember {
                ButtonStyle(
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        fontWeight = FontWeight.W400,
                    ),
                    backgroundColor = AlnfTheme.colors.blue,
                    contentColor = AlnfTheme.colors.constantWhite,
                    pressedColor = AlnfTheme.colors.blue600,
                    disabledBackgroundColor = AlnfTheme.colors.warmGray4,
                    disabledContentColor = AlnfTheme.colors.gray28,
                    elevation = 0.dp,
                    shape = RoundedCornerShape(3.dp),
                    horizontalPadding = 16.dp,
                    minHeight = 44.dp,
                    minWidth = 44.dp,
                    iconPadding = 6.dp,
                    iconSize = 22.dp,
                )
            }
        }

    override val secondary: ButtonStyle
        @Composable
        get() {
            return remember {
                ButtonStyle(
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        fontWeight = FontWeight.W400,
                    ),
                    backgroundColor = AlnfTheme.colors.blue100,
                    contentColor = AlnfTheme.colors.blue700,
                    pressedColor = AlnfTheme.colors.blue700,
                    disabledContentColor = AlnfTheme.colors.warmGray4,
                    disabledBackgroundColor = AlnfTheme.colors.gray28,
                    elevation = 0.dp,
                    shape = RoundedCornerShape(3.dp),
                    horizontalPadding = 16.dp,
                    minHeight = 44.dp,
                    minWidth = 44.dp,
                    iconPadding = 6.dp,
                    iconSize = 22.dp,
                )
            }
        }
}