package com.example.debugging

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        division()

    }
}

fun logging() {
    Log.v(TAG, "Hello world!")
}

fun division() {
    val numerator = 60
    var denominator = 4
    repeat(5) {
        Log.v(TAG, "${numerator / denominator}")
        denominator--
    }
}