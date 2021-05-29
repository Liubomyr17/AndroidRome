package com.example.androidrome

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityFindViewById : AppCompatActivity() {

    lateinit var helloWorldTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloWorldTextView = findViewById(R.id.helloWorldTextView)
        helloWorldTextView.setTextColor(Color.GREEN)
    }
}