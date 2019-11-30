package ir.part.theme

import android.app.Application
import ir.part.theme.utils.Theme

class ThemeApp : Application() {

    companion object {
        lateinit var mTheme: Theme
    }

    override fun onCreate() {
        super.onCreate()
        // Create Theme
        mTheme = Theme(this)
    }
}