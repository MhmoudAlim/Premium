package mahmoud.alim.premium.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import mahmoud.alim.premium.R
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.domain.model.MatchStatus
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 12/11/2022.
 */


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
            .padding(
                start = spacing.spaceSmall,
                top = spacing.spaceSmall,
                bottom = spacing.spaceSmall
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(.9f)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(spacing.spaceExtraSmall)
            ) {
                TeamFlagView(fixture.homeTeamFlag, fixture.homeTeamName)
                TeamNameView(fixture.homeTeamName)
            }

            MatchMetaDetailsView(fixture)

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(spacing.spaceExtraSmall)
            ) {
                TeamNameView(fixture.awayTeamName)
                TeamFlagView(fixture.awayTeamFlag, fixture.awayTeamName)
            }
        }

        var favIconTint by remember { mutableStateOf(Color.DarkGray) }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(.1f)
        ) {
            IconButton(onClick = {
                favIconTint = Color.Yellow
                onFavFixtureClick()
            }) {
                Icon(
                    imageVector = Icons.Outlined.Star,
                    tint = favIconTint,
                    contentDescription = stringResource(id = R.string.favourite_fixture),
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@OptIn(ExperimentalCoilApi::class)
@Composable
private fun TeamFlagView(flag: String, name: String) {
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
        modifier = Modifier.size(24.dp)
    )
}


@Composable
private fun TeamNameView(name: String) {
    Text(
        text = name,
        style = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
        ),
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
private fun MatchMetaDetailsView(fixture: Fixture) {
    val spacing = LocalSpacing.current

    val matchMeta = when (fixture.status) {
        MatchStatus.Ended -> "${fixture.homeTeamScore ?: 0}-${fixture.awayTeamScore ?: 0}"
        MatchStatus.Scheduled -> fixture.matchTimeFormatted
    }
    val fontColor = when (fixture.status) {
        MatchStatus.Ended -> MaterialTheme.colors.primary
        MatchStatus.Scheduled -> MaterialTheme.colors.onPrimary
    }

    Text(
        text = matchMeta,
        style = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 13.sp,
            color = fontColor
        ),
        modifier = Modifier.padding(horizontal = spacing.spaceSmall)
    )

}
