package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val btnPrev5 = findViewById<ImageView>(R.id.btnPrev5)
        btnPrev5.setOnClickListener{finish()}
        binding.btnPrev5.setOnClickListener{
            finish()
        }
Picasso
    .get()
    .load("https://cdn.pixabay.com/photo/2023/04/23/15/07/ai-generated-7945910_960_720.jpg")
    .into(binding.imageView7)
    }
}