package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcome = WelcomeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.myFrame, welcome)
            commit()
        }

    }
}