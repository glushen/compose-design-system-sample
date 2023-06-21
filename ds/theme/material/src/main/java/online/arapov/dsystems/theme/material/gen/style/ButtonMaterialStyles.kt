package online.arapov.dsystems.theme.material.gen.style

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import online.arapov.dsystems.component.button.ButtonStyle
import online.arapov.dsystems.theme.material.gen.MaterialTheme

interface ButtonMaterialStyles {
    val primary: ButtonStyle
        @Composable
        get

    val secondary: ButtonStyle
        @Composable
        get
}

internal val LocalButtonMaterialStyles =
    staticCompositionLocalOf<ButtonMaterialStyles> { DefaultButtonMaterialStyles }

internal object DefaultButtonMaterialStyles : ButtonMaterialStyles {

    override val primary: ButtonStyle
        @Composable
        get() = remember {
            ButtonStyle(
                textStyle = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 18.sp,
                    fontWeight = FontWeight.W700,
                ),
                backgroundColor = MaterialTheme.colors.blue,
                contentColor = MaterialTheme.colors.white,
                pressedColor = MaterialTheme.colors.white,
                disabledContentColor = MaterialTheme.colors.gray28,
                disabledBackgroundColor = MaterialTheme.colors.blue,
                minHeight = 36.dp,
                minWidth = 64.dp,
                horizontalPadding = 16.dp,
                elevation = 0.dp,
                shape = RoundedCornerShape(3.dp),
                iconPadding = 6.dp,
                iconSize = 22.dp,
            )
        }

    override val secondary: ButtonStyle
        @Composable
        get() = remember {
            ButtonStyle(
                textStyle = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 18.sp,
                    fontWeight = FontWeight.W700,
                ),
                backgroundColor = MaterialTheme.colors.black,
                contentColor = MaterialTheme.colors.blue,
                pressedColor = MaterialTheme.colors.blue,
                disabledContentColor = MaterialTheme.colors.gray28,
                disabledBackgroundColor = MaterialTheme.colors.black,
                minHeight = 36.dp,
                minWidth = 64.dp,
                horizontalPadding = 16.dp,
                elevation = 0.dp,
                shape = RoundedCornerShape(3.dp),
                iconPadding = 6.dp,
                iconSize = 22.dp,
            )
        }
}