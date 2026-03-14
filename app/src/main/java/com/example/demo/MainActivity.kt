package com.example.demo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        // FAB 按钮点击事件
        findViewById<View>(R.id.fab).setOnClickListener {
            // 显示 Snackbar 消息
            Snackbar.make(it, "FAB 被点击了", Snackbar.LENGTH_SHORT)
                .setAction("撤销") {
                    textView.text = "已撤销"
                }
                .show()
        }

        // 扁平按钮点击事件
        findViewById<Button>(R.id.buttonText).setOnClickListener {
            showSnackbar(it, "这是扁平按钮")
        }

        // 轮廓按钮点击事件
        findViewById<Button>(R.id.buttonOutlined).setOnClickListener {
            showSnackbar(it, "这是轮廓按钮")
        }

        // 填充按钮点击事件
        findViewById<Button>(R.id.buttonFilled).setOnClickListener {
            showSnackbar(it, "这是填充按钮")
        }

        // 切换按钮点击事件
        findViewById<Button>(R.id.buttonToggle).setOnClickListener {
            showSnackbar(it, "切换按钮被点击")
        }
    }

    private fun showSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }
}
