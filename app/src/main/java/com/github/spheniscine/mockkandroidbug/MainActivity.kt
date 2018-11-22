package com.github.spheniscine.mockkandroidbug

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// Ignore this class
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
