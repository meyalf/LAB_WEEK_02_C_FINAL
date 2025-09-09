package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SingleTopActivity : AppCompatActivity() {

    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)

        Log.d(DEBUG, "SingleTopActivity onCreate")

        // Tombol untuk buka SingleTopActivity lagi (diri sendiri)
        findViewById<Button>(R.id.button_single_top).setOnClickListener {
            Log.d(DEBUG, "SingleTopActivity button clicked")
            startActivity(Intent(this, SingleTopActivity::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "SingleTopActivity onNewIntent")
    }
}