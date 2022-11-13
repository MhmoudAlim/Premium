package mahmoud.alim.premium.ui.screen.fixture.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import mahmoud.alim.premium.R
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.ui.components.MatchMetaDetailsView
import mahmoud.alim.premium.ui.components.TeamFlagView
import mahmoud.alim.premium.ui.components.TeamNameView
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

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(.1f)
        ) {
            IconButton(onClick = {
                onFavFixtureClick()
            }) {
                Icon(
                    imageVector = Icons.Outlined.Star,
                    tint = Color.Yellow,
                    contentDescription = stringResource(id = R.string.favourite_fixture),
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}




