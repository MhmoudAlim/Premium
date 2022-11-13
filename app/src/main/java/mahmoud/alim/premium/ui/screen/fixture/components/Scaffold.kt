package mahmoud.alim.premium.ui.screen.fixture.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import mahmoud.alim.premium.R
import mahmoud.alim.premium.ui.util.LocalSpacing

/**
 * @author Mahmoud Alim on 12/11/2022.
 */

@Composable
fun HomeScaffold(
    onNavigate: () -> Unit,
    content: @Composable() () -> Unit
) {
    var displayMenu by remember { mutableStateOf(false) }
    val spacing = LocalSpacing.current
    Column(Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(stringResource(R.string.premium_league), color = Color.White) },
            backgroundColor = MaterialTheme.colors.primary,
            actions = {
                // Creating Icon button for dropdown menu
                IconButton(onClick = { displayMenu = !displayMenu }) {
                    Icon(Icons.Default.MoreVert, "")
                }
                DropdownMenu(
                    expanded = displayMenu,
                    onDismissRequest = { displayMenu = false }
                ) {
                    DropdownMenuItem(onClick = {
                        displayMenu = false
                        onNavigate()
                    }) {
                        Text(text = stringResource(R.string.show_fav))
                    }
                }
            }
        )
        Spacer(modifier = Modifier.height(spacing.spaceSmall))
        content()
    }

}