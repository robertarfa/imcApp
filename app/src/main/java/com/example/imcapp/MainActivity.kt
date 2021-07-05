package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "onDestroy")
    }
}