package mahmoud.alim.premium.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import mahmoud.alim.premium.ui.util.Dimensions
import mahmoud.alim.premium.ui.util.LocalSpacing

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

@Composable
fun PremiumTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {

    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colors = LightColorPalette,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}