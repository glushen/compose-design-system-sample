package online.arapov.dsystems.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import online.arapov.dsystems.core.LocalContentColor
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
        border = null,
        enabled = enabled,
        indication = rememberRipple()
    ) {
        CompositionLocalProvider(
            LocalContentColor provides style.contentColor
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

                Text(text = title)

                contentRight?.invoke()
            }
        }
    }
}