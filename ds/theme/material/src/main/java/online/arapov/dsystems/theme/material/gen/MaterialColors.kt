package online.arapov.dsystems.theme.material.gen

import androidx.compose.ui.graphics.Color
import online.arapov.dsystems.core.ThemeColor

data class MaterialColors(
    val white: ThemeColor = ThemeColor(Color(0xFFFFFFFF), Color(0xFF121212)),
    val black: ThemeColor = ThemeColor(Color(0xFF000000), Color(0xFFE3E3E3)),
    val blue: ThemeColor = ThemeColor(Color(0xFF00AAFF), Color(0xFF008FDB)),
    val gray48: ThemeColor = ThemeColor(Color(0xFF858585), Color(0xFF7A7A7A)),
    val gray28: ThemeColor = ThemeColor(Color(0xFFB8B8B8), Color(0xFF545454)),
    val gray12: ThemeColor = ThemeColor(Color(0xFFE0E0E0), Color(0xFF363636)),
    val red: ThemeColor = ThemeColor(Color(0xFFFF6163), Color(0xFFF54E57)),
    val transparentBlack: ThemeColor = ThemeColor(Color(0x00FFFFFF), Color(0x00121212)),
    val transparentWhite: ThemeColor = ThemeColor(Color(0x00000000), Color(0x00E3E3E3)),
)