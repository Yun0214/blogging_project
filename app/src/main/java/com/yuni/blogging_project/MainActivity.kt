package com.yuni.blogging_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yuni.blogging_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)


        }
    }
}