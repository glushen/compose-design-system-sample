package online.arapov.dsystems.theme.v2

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class AlnfColors(
    val constantWhite: Color,
    val constantBlack: Color,
    val blue: Color,
    val blue600: Color,
    val warmGray4: Color,
    val gray28: Color,
    val green50: Color,
)

internal fun lightColors() = AlnfColors(
    constantWhite = Color(0xFFFFFFFF),
    constantBlack = Color(0xFF000000),
    blue = Color(0xFF00AAFF),
    blue600 = Color(0xFF0099F7),
    warmGray4 = Color(0xFFF2F1F0),
    gray28 = Color(0xFFB8B8B8),
    green50 = Color(0xFFEAFCCF),
)

internal fun darkColors() = AlnfColors(
    constantWhite = Color(0xFFFFFFFF),
    constantBlack = Color(0xFF000000),
    blue = Color(0xFF00AAFF),
    blue600 = Color(0xFF0099F7),
    warmGray4 = Color(0xFFF2F1F0),
    gray28 = Color(0xFFB8B8B8),
    green50 = Color(0xFFEAFCCF),
)

internal val LocalAlnfColor = staticCompositionLocalOf { lightColors() }