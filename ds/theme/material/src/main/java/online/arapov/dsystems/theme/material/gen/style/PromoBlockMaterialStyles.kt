package online.arapov.dsystems.theme.material.gen.style

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import online.arapov.dsystems.component.button.ButtonStyle
import online.arapov.dsystems.component.promo_block.PromoBlockStyle
import online.arapov.dsystems.core.ThemeColor
import online.arapov.dsystems.theme.material.gen.MaterialTheme

interface PromoBlockMaterialStyles {
    val blue: PromoBlockStyle
        @Composable
        get
}

internal val LocalPromoBlockMaterialStyles =
    staticCompositionLocalOf { DefaultPromoBlockMaterialStyles }

internal object DefaultPromoBlockMaterialStyles : PromoBlockMaterialStyles {
    override val blue: PromoBlockStyle
        @Composable
        get() = remember {
            PromoBlockMaterialStyleImpl(
                ButtonStyle(
                    textStyle = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight.W700,
                    ),
                    backgroundColor = ThemeColor(Color(0xFFFFFFFF)),
                    disabledBackgroundColor = ThemeColor(Color(0xFFE7F7FF)),
                    contentColor = ThemeColor(Color(0xFF000000)),
                    disabledContentColor = ThemeColor(Color(0xFFA6B2B8)),
                    pressedColor = MaterialTheme.colors.white,
                    minHeight = 36.dp,
                    minWidth = 64.dp,
                    horizontalPadding = 16.dp,
                    elevation = 0.dp,
                    shape = RoundedCornerShape(6.dp),
                    iconPadding = 6.dp,
                    iconSize = 22.dp,
                ),
                ButtonStyle(
                    textStyle = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight.W700,
                    ),
                    backgroundColor = ThemeColor(Color(0xFFFFFFFF)),
                    disabledBackgroundColor = ThemeColor(Color(0xFFE7F7FF)),
                    contentColor = ThemeColor(Color(0xFF000000)),
                    disabledContentColor = ThemeColor(Color(0xFFA6B2B8)),
                    pressedColor = MaterialTheme.colors.white,
                    minHeight = 36.dp,
                    minWidth = 64.dp,
                    horizontalPadding = 16.dp,
                    elevation = 0.dp,
                    shape = RoundedCornerShape(6.dp),
                    iconPadding = 6.dp,
                    iconSize = 22.dp,
                ),
                ThemeColor(Color(0xFFD4F0FF)),
                RoundedCornerShape(20.dp)
            )
        }
}