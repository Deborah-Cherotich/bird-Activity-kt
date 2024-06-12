package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivitySecondBirdBinding
import com.example.myapplication.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityThirdBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val btnPrev2 = findViewById<ImageView>(R.id.btnPrev2)
        val btnNext4 = findViewById<ImageView>(R.id.btnNext4)

        btnPrev2.setOnClickListener{
            finish()
        }
        binding.btnNext4.setOnClickListener{
            finish()
        }

        btnNext4.setOnClickListener{
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get()
            .load("https://cdn.pixabay.com/photo/2023/04/23/15/07/ai-generated-7945910_960_720.jpg").into(binding.imageView6)

        }
    }
