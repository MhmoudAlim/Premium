package mahmoud.alim.premium.ui.screen.favourites.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.ui.components.MatchMetaDetailsView
import mahmoud.alim.premium.ui.components.TeamFlagView
import mahmoud.alim.premium.ui.components.TeamNameView
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 13/11/2022.
 */
@Composable
fun FavouriteView(
    fixture: Fixture,
    modifier: Modifier = Modifier,
) {
    val spacing = LocalSpacing.current
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(spacing.spaceMedium))
            .background(
                color = MaterialTheme.colors.primary.copy(.2f),
                shape = RoundedCornerShape(spacing.spaceMedium)
            )
            .padding(spacing.spaceSmall),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = spacing.spaceSmall)
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
    }
}

