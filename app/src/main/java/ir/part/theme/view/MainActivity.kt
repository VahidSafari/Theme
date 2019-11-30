package ir.part.theme.view

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ir.part.theme.R
import ir.part.theme.utils.BaseActivity
import ir.part.theme.utils.createStudents
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        setting.setOnClickListener {
            ThemeActivity.newInstance(this)
        }
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = StudentAdapter(createStudents())
        }
    }
}
