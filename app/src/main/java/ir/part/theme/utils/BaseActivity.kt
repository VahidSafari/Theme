package ir.part.theme.utils

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(), IKDispatcher {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(Theme.getTheme(this))
        super.onCreate(savedInstanceState)
        themeSubscriber()
    }

    override fun onDestroy() {
        super.onDestroy()
        unsubscribe(Theme.ThemeChanged, this::themeHandler)
    }

    private fun themeSubscriber() {
        subscribe(Theme.ThemeChanged, null, this::themeHandler)
    }

    private fun themeHandler(notification: Notification<Any>) {
        Log.d(Theme.ThemeChanged, notification.eventName)
        recreate()
    }

    fun changeTheme(themeName: String) {
        Theme.setTheme(this, themeName)
        call(Theme.ThemeChanged)
    }
}