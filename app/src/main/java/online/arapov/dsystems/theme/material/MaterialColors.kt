package online.arapov.dsystems.theme.material

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class MaterialColors(
    val white: Color,
    val black: Color,
    val blue: Color,
    val gray48: Color,
    val gray28: Color,
    val gray12: Color,
    val red: Color,
    val transparentBlack: Color,
    val transparentWhite: Color,
)

internal fun lightColors() = MaterialColors(
    white = Color(0xFFFFFFFF),
    black = Color(0xFF000000),
    blue = Color(0xFF00AAFF),
    gray48 = Color(0xFF858585),
    gray28 = Color(0xFFB8B8B8),
    gray12 = Color(0xFFE0E0E0),
    red = Color(0xFFFF6163),
    transparentWhite = Color(0x00FFFFFF),
    transparentBlack = Color(0x00000000),
)

internal fun darkColors() = MaterialColors(
    white = Color(0xFF121212),
    black = Color(0xFFE3E3E3),
    blue = Color(0xFF008FDB),
    gray48 = Color(0xFF7A7A7A),
    gray28 = Color(0xFF545454),
    gray12 = Color(0xFF363636),
    red = Color(0xFFF54E57),
    transparentWhite = Color(0x00121212),
    transparentBlack = Color(0x00E3E3E3),
)

internal val LocalMaterialColor = staticCompositionLocalOf { lightColors() }