package online.arapov.dsystems.component

import androidx.compose.foundation.layout.*
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
    iconLeft: (@Composable () -> Unit)? = null,
    enabled: Boolean = true
) {

    val backgroundColor = style.backgroundColor(enabled)
    val contentColor = style.contentColor(enabled)
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = style.shape,
        elevation = style.elevation,
        backgroundColor = backgroundColor.value,
        border = null,
        enabled = enabled,
        indication = rememberRipple()
    ) {

        val icon: (@Composable () -> Unit)? = if (iconLeft != null) {
            {
                Box(
                    modifier = Modifier
                        .padding(style.iconPadding)
                        .size(style.iconSize),
                    contentAlignment = Alignment.Center,
                ) {
                    iconLeft()
                }
            }
        } else null

        CompositionLocalProvider(
            LocalContentColor provides contentColor.value
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
                icon?.invoke()

                Text(text = title)

            }
        }
    }
}