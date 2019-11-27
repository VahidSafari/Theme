package ir.part.theme.utils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(Theme.getTheme(this))
        super.onCreate(savedInstanceState)
    }
}