package online.arapov.dsystems.theme.material.gen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.theme.material.gen.style.ButtonMaterialStyles
import online.arapov.dsystems.theme.material.gen.style.LocalButtonMaterialStyles
import online.arapov.dsystems.theme.material.gen.style.LocalPromoBlockMaterialStyles
import online.arapov.dsystems.theme.material.gen.style.PromoBlockMaterialStyles


object MaterialTheme : online.arapov.dsystems.core.BaseTheme {

    val colors: MaterialColors = MaterialColors()

    val buttonStyles: ButtonMaterialStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalButtonMaterialStyles.current

    val promoBlockStyles: PromoBlockMaterialStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalPromoBlockMaterialStyles.current
}