package online.arapov.dsystems.theme.alnf.gen.style

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
import online.arapov.dsystems.theme.alnf.gen.AlnfTheme

interface PromoBlockAlnfStyles {
    val blue: PromoBlockStyle
        @Composable
        get
}

internal val LocalPromoBlockAlnfStyles =
    staticCompositionLocalOf<PromoBlockAlnfStyles> { DefaultPromoBlockAlnfStyles }

private object DefaultPromoBlockAlnfStyles : PromoBlockAlnfStyles {
    override val blue: PromoBlockStyle
        @Composable
        get() = remember {
            PromoBlockStyleImpl(
                ButtonStyle(
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        fontWeight = FontWeight.W400,
                    ),
                    backgroundColor = ThemeColor(Color(0xFFFFFFFF)),
                    disabledBackgroundColor = ThemeColor(Color(0xFFE7F7FF)),
                    contentColor = ThemeColor(Color(0xFF000000)),
                    disabledContentColor = ThemeColor(Color(0xFFA6B2B8)),
                    pressedColor = AlnfTheme.colors.blue600,
                    elevation = 0.dp,
                    shape = RoundedCornerShape(6.dp),
                    horizontalPadding = 16.dp,
                    minHeight = 44.dp,
                    minWidth = 44.dp,
                    iconPadding = 6.dp,
                    iconSize = 22.dp,
                ),
                ButtonStyle(
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        fontWeight = FontWeight.W400,
                    ),

                    backgroundColor = ThemeColor(Color(0xFFFFFFFF)),
                    disabledBackgroundColor = ThemeColor(Color(0xFFE7F7FF)),
                    contentColor = ThemeColor(Color(0xFF000000)),
                    disabledContentColor = ThemeColor(Color(0xFFA6B2B8)),
                    pressedColor = AlnfTheme.colors.blue600,
                    elevation = 0.dp,
                    shape = RoundedCornerShape(6.dp),
                    horizontalPadding = 16.dp,
                    minHeight = 44.dp,
                    minWidth = 44.dp,
                    iconPadding = 6.dp,
                    iconSize = 22.dp,
                ),
                ThemeColor(Color(0xFFD4F0FF)),
                RoundedCornerShape(20.dp)
            )
        }
}