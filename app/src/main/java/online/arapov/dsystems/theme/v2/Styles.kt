package online.arapov.dsystems.theme.v2

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.theme.v1.MaterialButtonStyles
import online.arapov.dsystems.theme.v1.MaterialTheme

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

    val secondary: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = primary.copy(
            backgroundColor = AlnfTheme.colors.blue100,
            contentColor = AlnfTheme.colors.blue700,
            pressedColor = AlnfTheme.colors.blue700,
            disabledContentColor = AlnfTheme.colors.warmGray4,
            disabledBackgroundColor = AlnfTheme.colors.gray28,
        )


            @Composable
    fun default(): ButtonStyle = primary
}