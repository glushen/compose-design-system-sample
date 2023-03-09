package online.arapov.dsystems.theme.alnf.gen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import online.arapov.dsystems.core.BaseTheme
import online.arapov.dsystems.theme.alnf.gen.style.ButtonAlnfStyles
import online.arapov.dsystems.theme.alnf.gen.style.LocalButtonAlnfStyles
import online.arapov.dsystems.theme.alnf.gen.style.LocalPromoBlockAlnfStyles
import online.arapov.dsystems.theme.alnf.gen.style.PromoBlockAlnfStyles


object AlnfTheme : BaseTheme {

    val colors: AlnfColors
        @Composable
        @ReadOnlyComposable
        get() = LocalAlnfColor.current

    val buttonStyles: ButtonAlnfStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalButtonAlnfStyles.current

    val promoBlockStyles: PromoBlockAlnfStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalPromoBlockAlnfStyles.current
}