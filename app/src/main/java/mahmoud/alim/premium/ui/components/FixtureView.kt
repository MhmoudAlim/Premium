package mahmoud.alim.premium.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import mahmoud.alim.premium.R
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.domain.model.MatchStatus
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 12/11/2022.
 */


@OptIn(ExperimentalCoilApi::class)
@Composable
fun FixtureView(
    fixture: Fixture,
    modifier: Modifier = Modifier,
    onFavFixtureClick: () -> Unit
) {
    val spacing = LocalSpacing.current

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(spacing.spaceMedium),
        horizontalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(spacing.spaceMedium)
        ) {
            Image(
                painter = rememberImagePainter(
                    data = fixture.homeTeamFlag,
                    builder = {
                        crossfade(true)
                        error(R.drawable.ic_premier_league)
                        fallback(R.drawable.ic_premier_league)
                    }
                ),
                contentDescription = fixture.homeTeamName,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(24.dp)
            )
            Text(fixture.homeTeamName)
        }
        Spacer(modifier = Modifier.width(12.dp))
        when (fixture.status) {
            MatchStatus.Ended -> Text("${fixture.homeTeamScore ?: 0}-${fixture.awayTeamScore ?: 0}")
            MatchStatus.Scheduled -> Text(fixture.matchDate)
        }
        Spacer(modifier = Modifier.width(12.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(fixture.awayTeamName)
            Image(
                painter = rememberImagePainter(
                    data = fixture.awayTeamFlag,
                    builder = {
                        crossfade(true)
                        error(R.drawable.ic_premier_league)
                        fallback(R.drawable.ic_premier_league)
                    }
                ),
                contentDescription = fixture.awayTeamName,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { onFavFixtureClick() }) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = stringResource(id = R.string.favourite_fixture)
            )

        }

    }
}
