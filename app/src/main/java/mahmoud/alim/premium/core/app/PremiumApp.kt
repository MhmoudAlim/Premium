package mahmoud.alim.premium.core.app

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.hilt.android.HiltAndroidApp

/**
 * @author Mahmoud Alim on 12/11/2022.
 */

@HiltAndroidApp
class PremiumApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}