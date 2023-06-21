package online.arapov.dsystems.theme.material.compat

import androidx.compose.runtime.Composable
import online.arapov.dsystems.component.button.ButtonStyle
import online.arapov.dsystems.theme.alnf.gen.AlnfTheme
import online.arapov.dsystems.theme.material.gen.style.ButtonMaterialStyles

internal object AlnfButtonMaterialCompat : ButtonMaterialStyles {
    override val primary: ButtonStyle
        @Composable
        get() = AlnfTheme.buttonStyles.primary
    override val secondary: ButtonStyle
        @Composable
        get() = AlnfTheme.buttonStyles.secondary
}