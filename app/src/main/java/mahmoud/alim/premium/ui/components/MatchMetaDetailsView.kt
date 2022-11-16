package mahmoud.alim.premium.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.domain.model.MatchStatus
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 13/11/2022.
 */
@Composable
fun MatchMetaDetailsView(fixture: Fixture) {
    val spacing = LocalSpacing.current

    val matchMeta = when (fixture.status) {
        MatchStatus.Ended -> "${fixture.homeTeamScore ?: 0}-${fixture.awayTeamScore ?: 0}"
        MatchStatus.Scheduled -> fixture.matchTimeFormatted
    }
    val fontColor = when (fixture.status) {
        MatchStatus.Ended -> MaterialTheme.colors.primary
        MatchStatus.Scheduled -> MaterialTheme.colors.onPrimary
    }

    val backGroundColor = when (fixture.status) {
        MatchStatus.Ended -> MaterialTheme.colors.onPrimary
        MatchStatus.Scheduled -> MaterialTheme.colors.primary
    }

    Column(
        modifier = Modifier
            .background(
                color = backGroundColor,
                shape = RoundedCornerShape(spacing.spaceExtraLarge)
            )
            .padding(spacing.spaceSmall)
            .padding(horizontal = spacing.spaceExtraSmall),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = matchMeta,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                color = fontColor
            ),
            overflow = TextOverflow.Visible,
            maxLines = 1

        )
    }


}