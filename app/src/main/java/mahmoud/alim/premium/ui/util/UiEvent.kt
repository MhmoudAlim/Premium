package mahmoud.alim.premium.ui.util

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
sealed class UiEvent {
    data class Navigate(val route: String) : UiEvent()
    class ShowSnackBar(val message: UiText) : UiEvent()
}
