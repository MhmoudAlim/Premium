package mahmoud.alim.premium.ui.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import mahmoud.alim.premium.R
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.ui.components.MatchMetaDetailsView
import mahmoud.alim.premium.ui.components.TeamFlagView
import mahmoud.alim.premium.ui.components.TeamNameView
import mahmoud.alim.premium.ui.screen.fixture.state.FixtureState
import mahmoud.alim.premium.ui.theme.Purple200
import mahmoud.alim.premium.ui.util.FixtureType
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 12/11/2022.
 */

@Composable
fun FixtureView(
    fixture: Fixture,
    modifier: Modifier = Modifier,
    viewType: FixtureType = FixtureType.Fixture,
    onFavFixtureClick: () -> Unit = {}
) {
    val spacing = LocalSpacing.current
    var favIconTint by remember { mutableStateOf(Purple200) }
    var favIcon by remember { mutableStateOf(Icons.Outlined.FavoriteBorder) }

    Column(
        modifier = Modifier.padding(spacing.spaceSmall)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(spacing.spaceLarge))
                .background(
                    color = MaterialTheme.colors.primary.copy(.2f),
                    shape = RoundedCornerShape(spacing.spaceLarge)
                )
                .padding(spacing.spaceMedium),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (viewType == FixtureType.Fixture) {
                Row(
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Top,
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = {
                        favIconTint = Color.Red
                        favIcon = Icons.Filled.Favorite
                        onFavFixtureClick()
                    },
                        modifier = Modifier
                            .background(color = Color.White, shape = CircleShape)
                            .size(32.dp)
                            .clip(CircleShape)
                            .semantics {
                                contentDescription = "Favourite"
                            }) {
                        Icon(
                            imageVector = favIcon,
                            tint = favIconTint,
                            contentDescription = stringResource(id = R.string.favourite_fixture),
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
            if (viewType == FixtureType.Favourites) {
                Spacer(modifier = Modifier.height(spacing.spaceMedium))
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.weight(.4f)
                ) {
                    TeamFlagView(fixture.homeTeamFlag, fixture.homeTeamName)
                    Spacer(modifier = Modifier.width(spacing.spaceSmall))
                    TeamNameView(fixture.homeTeamName)

                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.weight(.25f)
                ) {
                    MatchMetaDetailsView(fixture)
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.weight(.4f)
                ) {
                    TeamFlagView(fixture.awayTeamFlag, fixture.awayTeamName)
                    Spacer(modifier = Modifier.width(spacing.spaceSmall))
                    TeamNameView(fixture.awayTeamName)
                }
            }
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
        }
    }
}
