package com.yuni.blogging_project

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yuni.blogging_project.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)

            layer.setOnClickListener {
                rotate(it)
            }
            textView.setOnClickListener {
               showToast()
            }
            textView2.setOnClickListener {
                showToast()
            }
        }
    }

    fun showToast() {
        Toast.makeText(this@MainActivity,"textView_Clicked",Toast.LENGTH_SHORT).show()
    }

    fun rotate(view: View?) {
        val rotate = ObjectAnimator.ofFloat(view, "rotation", 0f, 360f)
        rotate.duration = 500
        rotate.start()
    }
}