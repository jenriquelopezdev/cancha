package com.elopez.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textViewSearch = findViewById<TextView>(R.id.textViewSearch)

        textViewSearch.setOnClickListener { view ->

        }
    }
}
