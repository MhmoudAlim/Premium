package mahmoud.alim.premium.core.network

import kotlinx.coroutines.flow.Flow

/**
 * @author Mahmoud Alim on 14/11/2022.
 */
interface ConnectivityObserver {

    fun observe(): Flow<NetworkStatus>

    enum class NetworkStatus {
        Available,
        Idle,
        Lost;
    }
}