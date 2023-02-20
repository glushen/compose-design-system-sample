package online.arapov.dsystems.theme.material.compat

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.core.styles.ButtonStyle
import online.arapov.dsystems.theme.material.ButtonMaterialStyles
import online.arapov.dsystems.theme.alnf.AlnfTheme

internal object AlnfButtonMaterialCompat : ButtonMaterialStyles {
    override val primary: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = AlnfTheme.buttonStyles.primary
    override val secondary: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = AlnfTheme.buttonStyles.secondary
}