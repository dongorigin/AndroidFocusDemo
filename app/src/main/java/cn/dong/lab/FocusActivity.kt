package cn.dong.lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class FocusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_focus)

        findViewById<View>(R.id.focusableNotSet).setOnClickListener {
            toast("A is clicked")
        }
        findViewById<View>(R.id.unfocusable).setOnClickListener {
            toast("B is clicked")
        }
        findViewById<View>(R.id.focusable).setOnClickListener {
            toast("C is clicked")
        }
        findViewById<View>(R.id.focusableInTouchMode).setOnClickListener {
            toast("D is clicked")
        }
        findViewById<View>(R.id.focusableInTouchMode2).setOnClickListener {
            toast("E is clicked")
        }
        findViewById<View>(R.id.button).setOnClickListener {
            toast("Button1 is clicked")
        }
        findViewById<View>(R.id.buttonTouchMode).setOnClickListener {
            toast("Button2 is clicked")
        }
    }

    private var toast: Toast? = null
    fun toast(msg: String) {
        toast?.cancel()
        toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT).apply {
            show()
        }
    }
}