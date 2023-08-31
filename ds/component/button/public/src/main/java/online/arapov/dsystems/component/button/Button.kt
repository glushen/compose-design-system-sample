package online.arapov.dsystems.component.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier

typealias ButtonType = @Composable (
    title: String,
    style: ButtonStyle,
    onClick: () -> Unit,
    modifier: Modifier,
    iconLeft: (@Composable () -> Unit)?,
    enabled: Boolean
) -> Unit

@Composable
fun Button(
    delegate: ButtonType,
    title: String,
    style: ButtonStyle,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    iconLeft: (@Composable () -> Unit)? = null,
    enabled: Boolean = true
) = delegate(
    title,
    style,
    onClick,
    modifier,
    iconLeft,
    enabled
)

interface ButtonDelegateHolder {
    val delegate: ButtonType
}
