package online.arapov.dsystems.theme.v2

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import online.arapov.dsystems.core.styles.ButtonStyle

object AlnfButtonStyles {

    val primary: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle(
            textStyle = TextStyle(
                fontSize = 16.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight.W400,
            ),
            border = null,
            backgroundColor = AlnfTheme.colors.blue,
            contentColor = AlnfTheme.colors.constantWhite,
            pressedColor = AlnfTheme.colors.blue600,
            disabledBackgroundColor = AlnfTheme.colors.warmGray4,
            disabledContentColor = AlnfTheme.colors.gray28,
            elevation = 0.dp,
            shape = RoundedCornerShape(3.dp),
            horizontalPadding = 16.dp,
            minHeight = 44.dp,
            minWidth = 44.dp
        )


    @Composable
    fun default(): ButtonStyle = primary
}