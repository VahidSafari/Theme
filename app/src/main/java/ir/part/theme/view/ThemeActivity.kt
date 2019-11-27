package ir.part.theme.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import ir.part.theme.R
import ir.part.theme.utils.BaseActivity
import ir.part.theme.utils.Theme
import kotlinx.android.synthetic.main.activity_theme.*

class ThemeActivity : BaseActivity() {

    companion object {
        fun newInstance(context: Context) {
            context.startActivity(Intent(context, ThemeActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme)
        lightButton.setOnClickListener {
            themeChange(Theme.THEME_LIGHT)
        }
        darkButton.setOnClickListener {
            themeChange(Theme.THEME_DARK)
        }
        greenButton.setOnClickListener {
            themeChange(Theme.THEME_GREEN)
        }
        blueButton.setOnClickListener {
            themeChange(Theme.THEME_BLUE)
        }
    }
}
