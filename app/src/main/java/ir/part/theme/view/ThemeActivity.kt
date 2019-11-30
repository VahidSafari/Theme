package ir.part.theme.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import ir.part.theme.R
import ir.part.theme.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_theme.*

class ThemeActivity : BaseActivity(), ThemeHelper {

    companion object {
        fun newInstance(context: Context) {
            context.startActivity(Intent(context, ThemeActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme)
        initView()
    }

    private fun initView() {
        back.setOnClickListener {
            onBackPressed()
        }
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(this@ThemeActivity, 2)
            adapter = ThemeAdapter(mTheme.getTheme(), mTheme.themes, this@ThemeActivity)
        }
    }

    override fun onSelectTheme(theme: Int) {
        changeTheme(theme)
    }
}
