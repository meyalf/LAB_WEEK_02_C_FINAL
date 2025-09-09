package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(DEBUG, "MainActivity onCreate")

        // Listener untuk kedua tombol
        val buttonClickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.button_standard -> {
                    Log.d(DEBUG, "Standard button clicked")
                    startActivity(Intent(this, StandardActivity::class.java))
                }
                R.id.button_single_top -> {
                    Log.d(DEBUG, "Single Top button clicked")
                    startActivity(Intent(this, SingleTopActivity::class.java))
                }
            }
        }

        // Set listener ke tombol-tombol
        findViewById<Button>(R.id.button_standard).setOnClickListener(buttonClickListener)
        findViewById<Button>(R.id.button_single_top).setOnClickListener(buttonClickListener)
    }
}