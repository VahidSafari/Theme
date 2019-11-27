package ir.part.theme.view

import android.os.Bundle
import ir.part.theme.R
import ir.part.theme.utils.BaseActivity
import ir.part.theme.utils.Theme
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lightButton.setOnClickListener {
            Theme.setTheme(this, Theme.THEME_LIGHT)
            recreate()
        }
        darkButton.setOnClickListener {
            Theme.setTheme(this, Theme.THEME_DARK)
            recreate()
        }
        greenButton.setOnClickListener {
            Theme.setTheme(this, Theme.THEME_GREEN)
            recreate()
        }
        blueButton.setOnClickListener {
            Theme.setTheme(this, Theme.THEME_BLUE)
            recreate()
        }
    }
}
