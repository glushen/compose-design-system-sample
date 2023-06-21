package online.arapov.dsystems.theme.alnf.gen

import androidx.compose.ui.graphics.Color
import online.arapov.dsystems.core.ThemeColor

data class AlnfColors(
    val background: ThemeColor = ThemeColor(Color(0xFFFFFFFF), Color(0xFF121212)),
    val content: ThemeColor = ThemeColor(Color(0xFF000000), Color(0xFFFFFFFF)),
    val constantWhite: ThemeColor = ThemeColor(Color(0xFFFFFFFF), Color(0xFFFFFFFF)),
    val constantBlack: ThemeColor = ThemeColor(Color(0xFF000000), Color(0xFF000000)),
    val blue: ThemeColor = ThemeColor(Color(0xFF00AAFF), Color(0xFF00AAFF)),
    val blue100: ThemeColor = ThemeColor(Color(0xFFCCECFF), Color(0xFF002D57)),
    val blue700: ThemeColor = ThemeColor(Color(0xFF008AED), Color(0xFF00AAFF)),
    val blue600: ThemeColor = ThemeColor(Color(0xFF0099F7), Color(0xFF0099F7)),
    val warmGray4: ThemeColor = ThemeColor(Color(0xFFF2F1F0), Color(0xFFF2F1F0)),
    val gray28: ThemeColor = ThemeColor(Color(0xFFB8B8B8), Color(0xFFB8B8B8)),
    val green50: ThemeColor = ThemeColor(Color(0xFFEAFCCF), Color(0xFFEAFCCF)),
)