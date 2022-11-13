package mahmoud.alim.premium.ui.screen.fixture.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
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
            .clip(
                shape = RoundedCornerShape(spacing.spaceMedium)
            )
            .background(
                color = MaterialTheme.colors.primary.copy(.2f),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(spacing.spaceMedium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(date)
        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        fixtures.forEach {
            FixtureView(fixture = it) {
                onFavFixtureClick(it)
            }
        }
    }

}