package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StandardActivity : AppCompatActivity() {

    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)

        Log.d(DEBUG, "StandardActivity onCreate")

        // Tombol untuk buka StandardActivity lagi (diri sendiri)
        findViewById<Button>(R.id.button_standard).setOnClickListener {
            Log.d(DEBUG, "StandardActivity button clicked")
            startActivity(Intent(this, StandardActivity::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "StandardActivity onNewIntent")
    }
}