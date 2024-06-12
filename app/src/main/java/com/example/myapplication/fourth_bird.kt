package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityFifthBirdBinding
import com.example.myapplication.databinding.ActivityFourthBirdBinding
import com.example.myapplication.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class fourth_bird : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val btnPrev4 = findViewById<ImageView>(R.id.btnPrev4)
        val btnNext5= findViewById<ImageView>(R.id.btnNext5)

        btnPrev4.setOnClickListener{
            finish()
        }
        binding.btnNext5.setOnClickListener{
            finish()
        }

        btnNext5.setOnClickListener{
            val intent = Intent(this,ActivityFourthBirdBinding::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://cdn.pixabay.com/photo/2023/04/23/15/07/ai-generated-7945910_960_720.jpg")
            .into(binding.imageView4)
        }
    }
