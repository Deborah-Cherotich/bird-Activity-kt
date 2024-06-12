package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FifthBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_bird)
        val btnPrev5 = findViewById<ImageView>(R.id.btnPrev5)
        btnPrev5.setOnClickListener{finish()}

    }
}