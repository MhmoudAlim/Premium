package mahmoud.alim.premium.ui.screen.fixture.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import mahmoud.alim.premium.domain.model.Fixture
import mahmoud.alim.premium.ui.components.FixtureView
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
            .semantics {
                contentDescription = "Fixture"
            },
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = date,
            modifier = Modifier
                .padding(spacing.spaceSmall)
                .padding(start = spacing.spaceSmall),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = MaterialTheme.colors.primary
            ),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            fixtures.forEach {
                FixtureView(fixture = it) {
                    onFavFixtureClick(it)
                }
            }
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
        }
    }
}