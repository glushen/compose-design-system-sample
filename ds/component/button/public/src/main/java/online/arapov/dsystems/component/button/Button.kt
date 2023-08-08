package online.arapov.dsystems.component.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier

@Immutable
interface Button {
    @Composable
    operator fun invoke(
        title: String,
        style: ButtonStyle,
        onClick: () -> Unit,
        modifier: Modifier,
        iconLeft: (@Composable () -> Unit)?,
        enabled: Boolean
    )
}
