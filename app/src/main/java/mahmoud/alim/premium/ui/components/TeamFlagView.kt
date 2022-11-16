package mahmoud.alim.premium.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import mahmoud.alim.premium.R

/**
 * @author Mahmoud Alim on 13/11/2022.
 */
@OptIn(ExperimentalCoilApi::class)
@Composable
 fun TeamFlagView(flag: String, name: String) {
    Image(
        painter = rememberImagePainter(
            data = flag,
            builder = {
                crossfade(true)
                error(R.drawable.ic_premier_league)
                fallback(R.drawable.ic_premier_league)
            }
        ),
        contentDescription = name,
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(36.dp)
    )
}
