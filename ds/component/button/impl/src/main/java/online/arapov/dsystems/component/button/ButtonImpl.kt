package online.arapov.dsystems.component.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.squareup.anvil.annotations.ContributesBinding
import online.arapov.dsystems.core.LocalContentColor
import online.arapov.dsystems.core.di.AppScope
import online.arapov.dsystems.core.ui.Surface
import online.arapov.dsystems.core.ui.Text
import javax.inject.Inject

@ContributesBinding(AppScope::class)
class ButtonImpl @Inject constructor(): Button {
    @Composable
    override fun invoke(
        title: String,
        style: ButtonStyle,
        onClick: () -> Unit,
        modifier: Modifier,
        iconLeft: @Composable (() -> Unit)?,
        enabled: Boolean
    ) {

        val backgroundColor = style.backgroundColor(enabled)
        val contentColor = style.contentColor(enabled)
        Surface(
            onClick = onClick,
            modifier = modifier,
            shape = style.shape,
            elevation = style.elevation,
            color = backgroundColor.value(),
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
                LocalContentColor provides contentColor.value()
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
}