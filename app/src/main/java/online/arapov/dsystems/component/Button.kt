package online.arapov.dsystems.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import online.arapov.dsystems.core.component.Button
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.core.styles.LocalButtonStyle

@Composable
fun Button(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: ButtonStyle = LocalButtonStyle.current,
    contentLeft: (@Composable () -> Unit)? = null,
    contentRight: (@Composable () -> Unit)? = null,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = style.shape,
        elevation = style.elevation,
        backgroundColor = style.backgroundColor,
        border = style.border,
        enabled = enabled,
        indication = rememberRipple()
    ) {
        Row(
            modifier = Modifier
                .defaultMinSize(
                    minWidth = style.minWidth,
                    minHeight = style.minHeight
                )
                .padding(horizontal = style.horizontalPadding),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            contentLeft?.invoke()

            BasicText(
                text = title,
                style = style.textStyle
            )

            contentRight?.invoke()
        }
    }
}