package mahmoud.alim.premium.ui.util

import android.content.Context

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
sealed class UiText {
    data class DynamicString(val text: String) : UiText()
    data class StringResources(val resId: Int) : UiText()

    fun asString(context: Context): String {
        return when (this) {
            is DynamicString -> text
            is StringResources -> context.getString(resId)
        }
    }

}