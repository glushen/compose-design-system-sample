package online.arapov.dsystems.theme.alnf

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class AlnfColors(
    val background: Color,
    val content: Color,
    val constantWhite: Color,
    val constantBlack: Color,
    val blue: Color,
    val blue100: Color,
    val blue700: Color,
    val blue600: Color,
    val warmGray4: Color,
    val gray28: Color,
    val green50: Color,
)

internal fun lightColors() = AlnfColors(
    background = Color(0xFFFFFFFF),
    content = Color(0xFF000000),
    constantWhite = Color(0xFFFFFFFF),
    constantBlack = Color(0xFF000000),
    blue = Color(0xFF00AAFF),
    blue100 = Color(0xFFCCECFF),
    blue700 = Color(0xFF008AED),
    blue600 = Color(0xFF0099F7),
    warmGray4 = Color(0xFFF2F1F0),
    gray28 = Color(0xFFB8B8B8),
    green50 = Color(0xFFEAFCCF),
)

internal fun darkColors() = AlnfColors(
    background = Color(0xFF121212),
    content = Color(0xFFFFFFFF),
    constantWhite = Color(0xFFFFFFFF),
    constantBlack = Color(0xFF000000),
    blue = Color(0xFF00AAFF),
    blue100 = Color(0xFF002D57),
    blue700 = Color(0xFF00AAFF),
    blue600 = Color(0xFF0099F7),
    warmGray4 = Color(0xFFF2F1F0),
    gray28 = Color(0xFFB8B8B8),
    green50 = Color(0xFFEAFCCF),
)

internal val LocalAlnfColor = staticCompositionLocalOf { lightColors() }