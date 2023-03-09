package online.arapov.dsystems.component.button

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import online.arapov.dsystems.core.LocalContentColor
import online.arapov.dsystems.core.ui.Text

@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(5.dp),
    elevation: Dp = 0.dp,
    backgroundColor: Color = Color.Transparent,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = LocalIndication.current,
    enabled: Boolean = true,
    onClickLabel: String? = null,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .shadow(elevation, shape, clip = false)
            .then(if (border != null) Modifier.border(border, shape) else Modifier)
            .background(backgroundColor, shape)
            .then(
                Modifier.clickable(
                    interactionSource = interactionSource,
                    indication = indication,
                    enabled = enabled,
                    onClickLabel = onClickLabel,
                    role = Role.Button,
                    onClick = onClick
                )
            )
    ) {
        content()
    }
}


@Composable
fun Button(
    title: String,
    style: ButtonStyle,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
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
        enabled = enabled
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

                Text(
                    text = title,
                    style = style.textStyle
                )

            }
        }
    }
}