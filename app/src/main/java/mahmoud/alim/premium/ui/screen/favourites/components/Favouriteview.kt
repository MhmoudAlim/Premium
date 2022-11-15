package mahmoud.alim.premium.ui.screen.favourites.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
                color = Color.LightGray.copy(.8f),
                shape = RoundedCornerShape(spacing.spaceMedium)
            )
            .background(
                color = MaterialTheme.colors.primary.copy(.2f),
                shape = RoundedCornerShape(spacing.spaceMedium)
            )
            .padding(spacing.spaceExtraSmall)
            .padding(vertical = spacing.spaceSmall),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(.9f)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.weight(.4f)
            ) {
                TeamNameView(fixture.homeTeamName)
                Spacer(modifier = Modifier.width(spacing.spaceExtraSmall))
                TeamFlagView(fixture.homeTeamFlag, fixture.homeTeamName)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.weight(.2f)
            ) {
                MatchMetaDetailsView(fixture)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.weight(.4f)
            ) {
                TeamFlagView(fixture.awayTeamFlag, fixture.awayTeamName)
                Spacer(modifier = Modifier.width(spacing.spaceExtraSmall))
                TeamNameView(fixture.awayTeamName)
            }
        }
    }
}

