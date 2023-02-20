package online.arapov.dsystems

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import online.arapov.dsystems.component.Button
import online.arapov.dsystems.component.Icon
import online.arapov.dsystems.component.Text
import online.arapov.dsystems.theme.v1.MaterialTheme
import online.arapov.dsystems.theme.v2.AlnfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Screen()
        }
    }
}

@Composable
fun Screen() {
    var isDark by remember { mutableStateOf(false) }
    var isCompat by remember { mutableStateOf(false) }
    var isMaterial by remember { mutableStateOf(false) }

    if (isMaterial) {
        MaterialTheme(
            isDark = isDark
        ) {
            Content(
                isDark = isDark,
                darkModeChange = { isDark = !isDark },
                isCompat = isCompat,
                compatModeChange = { isCompat = !isCompat },
                isMaterial = isMaterial,
                themeChange = { isMaterial = !isMaterial }
            )
        }
    } else {
        AlnfTheme(
            isDark = isDark
        ) {
            Content(
                isDark = isDark,
                darkModeChange = { isDark = !isDark },
                isCompat = isCompat,
                compatModeChange = { isCompat = !isCompat },
                isMaterial = isMaterial,
                themeChange = { isMaterial = !isMaterial }
            )
        }
    }

}

@Composable
fun Content(
    isDark: Boolean = false,
    darkModeChange: () -> Unit = {},
    isCompat: Boolean = false,
    compatModeChange: () -> Unit = {},
    isMaterial: Boolean = false,
    themeChange: () -> Unit = {}
) {
    val image = ImageVector.vectorResource(id = R.drawable.ic_android_black_24dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                title = if (isMaterial) "Material Theme" else "Alnf Theme",
                onClick = themeChange
            )
            Button(
                title = if (isDark) "Dark Theme" else "Light Theme",
                onClick = darkModeChange
            )
            Button(
                title = if (isCompat) "Compat Enabled" else "Compat Disabled",
                onClick = compatModeChange
            )
        }
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(
            text = "Buttons:",
            modifier = Modifier.padding(top = 8.dp),
            style = TextStyle(
                fontWeight = FontWeight.Bold
            )
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                title = "Default Primary",
                onClick = {}
            )
            Button(
                title = "Icon",
                onClick = {},
                iconLeft = {
                    val painter = rememberVectorPainter(image = image)
                    Icon(
                        painter = painter
                    )
                }
            )
            Button(
                title = "Disabled",
                onClick = {},
                enabled = false
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            val buttonStyle = if (isMaterial)
                MaterialTheme.buttonStyles.secondary
            else
                AlnfTheme.buttonStyles.secondary
            Button(
                title = "Secondary",
                style = buttonStyle,
                onClick = {}
            )
            Button(
                title = "Icon",
                onClick = {},
                style = buttonStyle,
                iconLeft = {
                    val painter = rememberVectorPainter(image = image)
                    Icon(
                        painter = painter
                    )
                }
            )
            Button(
                title = "Disabled",
                onClick = {},
                style = buttonStyle,
                enabled = false
            )
        }
    }
}

@Preview(
    name = "Material",
    showBackground = true,
    device = Devices.PIXEL_4
)
@Composable
fun MaterialPreview() {
    MaterialTheme {
        Content()
    }
}

@Preview(
    name = "Alnf",
    showBackground = true,
    device = Devices.PIXEL_4
)
@Composable
fun AlnfPreview() {
    AlnfTheme {
        Content()
    }
}