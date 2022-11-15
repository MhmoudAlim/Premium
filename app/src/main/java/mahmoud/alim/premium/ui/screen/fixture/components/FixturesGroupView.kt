package mahmoud.alim.premium.ui.screen.fixture.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 13/11/2022.
 */

@Composable
fun FixturesGroupView(
    date: String,
    fixtures: List<Fixture>,
    modifier: Modifier = Modifier,
    onFavFixtureClick: (Fixture) -> Unit
) {
    val spacing = LocalSpacing.current
    Column(
        modifier = modifier
            .clip(shape = RoundedCornerShape(spacing.spaceMedium))
            .background(
                color = Color.LightGray.copy(.8f),
                shape = RoundedCornerShape(spacing.spaceMedium)
            ),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = date,
            modifier = Modifier
                .padding(spacing.spaceSmall)
                .padding(start = spacing.spaceSmall),
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
            ),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
        Column(
            modifier = modifier
                .clip(
                    shape = RoundedCornerShape(
                        bottomEnd = spacing.spaceMedium,
                        bottomStart = spacing.spaceMedium
                    )
                )
                .background(
                    color = MaterialTheme.colors.primary.copy(.2f),
                    shape = RoundedCornerShape(
                        bottomEnd = spacing.spaceMedium,
                        bottomStart = spacing.spaceMedium
                    )
                )
                .padding(spacing.spaceMedium),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            fixtures.forEach {
                FixtureView(fixture = it) {
                    onFavFixtureClick(it)
                }
            }
        }
    }
}