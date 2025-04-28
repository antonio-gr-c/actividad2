package com.example.miniproyecto2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val tag = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag, "onCreate llamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart llamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume llamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause llamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop llamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy llamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "onRestart llamado")
    }
}
