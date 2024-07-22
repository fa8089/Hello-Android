package com.example.test

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the TextView in the layout
        val textView = findViewById<TextView>(R.id.textView)

        // Set the text of the TextView
        textView.text = "Hello, Android!"
    }
}
