package ir.part.theme.utils

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ir.part.theme.ThemeApp

abstract class BaseActivity : AppCompatActivity(), IKDispatcher {

    val mTheme = ThemeApp.mTheme

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(localizedContext(newBase))
    }

    override fun onStart() {
        super.onStart()
        localizedContext(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(mTheme.getTheme())
        super.onCreate(savedInstanceState)
        themeSubscriber()
    }

    override fun onDestroy() {
        super.onDestroy()
        unsubscribe(mTheme.themeChanged, this::themeHandler)
    }

    private fun themeSubscriber() {
        subscribe(mTheme.themeChanged, null, this::themeHandler)
    }

    private fun themeHandler(notification: Notification<Any>) {
        Log.d(mTheme.themeChanged, notification.eventName)
        recreate()
    }

    fun changeTheme(theme: Int) {
        mTheme.setTheme(theme)
        call(mTheme.themeChanged)
    }
}