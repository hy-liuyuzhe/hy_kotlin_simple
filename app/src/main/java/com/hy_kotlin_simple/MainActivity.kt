package com.hy_kotlin_simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_constraint_height.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_height)
        set_b
            .setOnClickListener {
                r_b.visibility = View.VISIBLE
                r_b.text = "底部右文案底部右文案底部右文案底部右文案底部右文案底部右文案底部右文案底部右文案底部右文案底部右文案"

                left_top.visibility = View.VISIBLE
                left_top.text = "顶部左边"

                r_top.visibility = View.VISIBLE
                r_top.text = "顶部右边"
            }
    }
}