package mahmoud.alim.premium.ui.screen.fixture.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Favorite
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import mahmoud.alim.premium.R
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 12/11/2022.
 */

@Composable
fun HomeScaffold(
    title: String = stringResource(R.string.premium_league),
    onNavigate: () -> Unit,
    onShowAllFixtures: (Boolean) -> Unit,
    content: @Composable() () -> Unit
) {
    var displayMenu by remember { mutableStateOf(false) }
    val spacing = LocalSpacing.current

    Column(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.primary),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Row(Modifier.padding(spacing.spaceSmall)) {
                Spacer(modifier = Modifier.width(spacing.spaceSmall))
                Image(
                    painter = painterResource(R.drawable.ic_pl_header),
                    contentDescription = stringResource(R.string.premium_league),
                    contentScale = ContentScale.Crop,
                )
            }
        }
        TopAppBar(
            title = {
                Text(
                    text = title, color = Color.White
                )
            },
            backgroundColor = MaterialTheme.colors.primary,
            actions = {
                IconButton(onClick = {
                    displayMenu = false
                    onNavigate()
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Favorite,
                        tint = Color.White,
                        contentDescription = stringResource(id = R.string.favourite_fixture),
                        modifier = Modifier.size(20.dp)
                    )
                }

                IconButton(onClick = { displayMenu = !displayMenu }) {
                    Icon(Icons.Default.MoreVert, "")
                }
                DropdownMenu(
                    expanded = displayMenu,
                    onDismissRequest = { displayMenu = false }
                ) {
                    DropdownMenuItem(onClick = {
                        displayMenu = false
                        onShowAllFixtures(false)
                    }) {
                        Text(
                            text = stringResource(R.string.show_upcoming),
                            style = TextStyle(
                                fontSize = 14.sp,
                            )
                        )
                    }
                    DropdownMenuItem(onClick = {
                        displayMenu = false
                        onShowAllFixtures(true)
                    }) {
                        Text(
                            text = stringResource(R.string.show_all),
                            style = TextStyle(
                                fontSize = 14.sp,
                            )
                        )
                    }
                }
            }
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = spacing.spaceSmall),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }

}