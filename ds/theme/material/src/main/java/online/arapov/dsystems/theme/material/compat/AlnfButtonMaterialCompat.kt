package online.arapov.dsystems.theme.material.compat

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.component.button.ButtonStyle
import online.arapov.dsystems.theme.material.gen.style.ButtonMaterialStyles
import online.arapov.dsystems.theme.alnf.gen.AlnfTheme

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