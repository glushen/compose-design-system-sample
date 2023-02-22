package online.arapov.dsystems.theme.material

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import online.arapov.dsystems.core.styles.PromoBlockStyle

interface PromoBlockMaterialStyles {
    val blue: PromoBlockStyle
        @Composable
        @ReadOnlyComposable
        get

    @Composable
    fun default(): PromoBlockStyle = blue
}

internal val LocalPromoBlockMaterialStyles =
    staticCompositionLocalOf { DefaultPromoBlockMaterialStyles }

internal object DefaultPromoBlockMaterialStyles : PromoBlockMaterialStyles {
    override val blue: PromoBlockStyle
        @Composable
        @ReadOnlyComposable
        get() = PromoBlockMaterialStyleImpl(
            MaterialTheme.buttonStyles.primary.copy(
                backgroundColor = Color(0xFFFFFFFF),
                disabledBackgroundColor = Color(0xFFE7F7FF),
                contentColor = Color(0xFF000000),
                disabledContentColor = Color(0xFFA6B2B8),
                shape = RoundedCornerShape(6.dp),
            ),
            MaterialTheme.buttonStyles.secondary.copy(
                backgroundColor = Color(0xFFFFFFFF),
                disabledBackgroundColor = Color(0xFFE7F7FF),
                contentColor = Color(0xFF000000),
                disabledContentColor = Color(0xFFA6B2B8),
                shape = RoundedCornerShape(6.dp),
            ),
            Color(0xFFD4F0FF),
            RoundedCornerShape(20.dp)
        )
}