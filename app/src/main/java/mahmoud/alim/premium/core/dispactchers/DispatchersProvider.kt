package mahmoud.alim.premium.core.dispactchers

import kotlinx.coroutines.CoroutineDispatcher

/**
 * @author Mahmoud Alim on 12/11/2022.
 */
interface DispatcherProvider {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}