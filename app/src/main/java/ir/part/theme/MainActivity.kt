package ir.part.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(Theme.getTheme(this))
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
