package mahmoud.alim.premium.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

/**
 * @author Mahmoud Alim on 13/11/2022.
 */

@Composable
 fun TeamNameView(name: String) {
    Text(
        text = name,
        style = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
        ),
        overflow = TextOverflow.Ellipsis
    )
}
