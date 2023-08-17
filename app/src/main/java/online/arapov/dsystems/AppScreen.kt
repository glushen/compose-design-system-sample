package online.arapov.dsystems

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.squareup.anvil.annotations.ContributesBinding
import online.arapov.dsystems.component.button.Button
import online.arapov.dsystems.component.promo_block.PromoBlock
import online.arapov.dsystems.core.di.AppScope
import online.arapov.dsystems.core.ui.Icon
import online.arapov.dsystems.core.ui.Text
import online.arapov.dsystems.theme.alnf.AlnfTheme
import online.arapov.dsystems.theme.alnf.gen.AlnfTheme
import online.arapov.dsystems.theme.material.MaterialTheme
import online.arapov.dsystems.theme.material.gen.MaterialTheme
import javax.inject.Inject

interface AppScreen {
    @Composable
    operator fun invoke()
}

@ContributesBinding(AppScope::class)
class AppScreenImpl @Inject constructor(
    private val button: Button,
    private val promoBlock: PromoBlock
) : AppScreen {
    @Composable
    override operator fun invoke() {
        var isDark by remember { mutableStateOf(false) }
        var isCompat by remember { mutableStateOf(false) }
        var isMaterial by remember { mutableStateOf(false) }

        if (isMaterial) {
            MaterialTheme(
                isDark = isDark,
                isCompatModeEnabled = isCompat
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
    private fun Content(
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
                val buttonStyle = if (isMaterial)
                    MaterialTheme.buttonStyles.primary
                else
                    AlnfTheme.buttonStyles.primary
                button(
                    title = if (isMaterial) "Material Theme" else "Alnf Theme",
                    onClick = themeChange,
                    style = buttonStyle,
                    modifier = Modifier,
                    iconLeft = null,
                    enabled = true
                )
                button(
                    title = if (isDark) "Dark Theme" else "Light Theme",
                    onClick = darkModeChange,
                    style = buttonStyle,
                    modifier = Modifier,
                    iconLeft = null,
                    enabled = true
                )
                if (isMaterial) {
                    button(
                        title = if (isCompat) "Compat Enabled" else "Compat Disabled",
                        onClick = compatModeChange,
                        style = buttonStyle,
                        modifier = Modifier,
                        iconLeft = null,
                        enabled = true
                    )
                }
            }
            Text(
                text = stringResource(id = R.string.lorem_ipsum),
                style = TextStyle.Default
            )
            Text(
                text = "Buttons:",
                modifier = Modifier.padding(top = 8.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Bold
                )
            )
            Buttons(image, isMaterial)
            val promoBlockStyle = if (isMaterial)
                MaterialTheme.promoBlockStyles.blue
            else
                AlnfTheme.promoBlockStyles.blue

            // Class Cast Exception
//            promoBlock(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                style = promoBlockStyle
//            ) {
//                Column(
//                    modifier = Modifier.padding(
//                        top = 16.dp,
//                        bottom = 16.dp
//                    ),
//                    verticalArrangement = Arrangement.spacedBy(8.dp)
//                ) {
//                    Buttons(image, isMaterial)
//                }
//            }

            // Ok!
            promoBlock.Block(
                modifier = Modifier
                    .fillMaxWidth(),
                style = promoBlockStyle
            ) {
                Column(
                    modifier = Modifier.padding(
                        top = 16.dp,
                        bottom = 16.dp
                    ),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Buttons(image, isMaterial)
                }
            }
        }
    }

    @Composable
    private fun Buttons(
        image: ImageVector,
        isMaterial: Boolean
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            val buttonStyle = if (isMaterial)
                MaterialTheme.buttonStyles.primary
            else
                AlnfTheme.buttonStyles.primary
            button(
                title = "Primary",
                onClick = {},
                style = buttonStyle,
                modifier = Modifier,
                iconLeft = null,
                enabled = true
            )
            button(
                title = "Icon",
                onClick = {},
                iconLeft = {
                    val painter = rememberVectorPainter(image = image)
                    Icon(
                        painter = painter
                    )
                },
                style = buttonStyle,
                modifier = Modifier,
                enabled = true
            )
            button(
                title = "Disabled",
                onClick = {},
                enabled = false,
                style = buttonStyle,
                modifier = Modifier,
                iconLeft = null,
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
            button(
                title = "Secondary",
                style = buttonStyle,
                onClick = {},
                modifier = Modifier,
                iconLeft = null,
                enabled = true
            )
            button(
                title = "Icon",
                onClick = {},
                style = buttonStyle,
                iconLeft = {
                    val painter = rememberVectorPainter(image = image)
                    Icon(
                        painter = painter
                    )
                },
                modifier = Modifier,
                enabled = true
            )
            button(
                title = "Disabled",
                onClick = {},
                style = buttonStyle,
                enabled = false,
                modifier = Modifier,
                iconLeft = null,
            )
        }
    }
}