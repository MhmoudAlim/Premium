package mahmoud.alim.premium.core.navigation

import androidx.navigation.NavController
import mahmoud.alim.premium.ui.util.UiEvent

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}