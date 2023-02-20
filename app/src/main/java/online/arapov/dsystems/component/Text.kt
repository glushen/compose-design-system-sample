package online.arapov.dsystems.component

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import online.arapov.dsystems.core.LocalContentColor

@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    style: TextStyle = TextStyle.Default
) {
    val textColor = color.takeOrElse {
        style.color.takeOrElse {
            LocalContentColor.current
        }
    }
    val mergedStyle = style.merge(
        TextStyle(
            color = textColor
        )
    )
    BasicText(
        text = text,
        modifier = modifier,
        style = mergedStyle
    )
}