package ir.part.theme.view

import android.os.Bundle
import ir.part.theme.R
import ir.part.theme.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeTheme.setOnClickListener {
            ThemeActivity.newInstance(this)
        }
    }
}
