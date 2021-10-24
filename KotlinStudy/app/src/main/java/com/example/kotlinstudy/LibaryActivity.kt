package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class LibaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libary)
        val glide : ImageView = findViewById(R.id.glide)

        Glide.with(this@LibaryActivity)
            .load("https://postfiles.pstatic.net/MjAyMTEwMDFfMjEx/MDAxNjMzMDE5ODE5MjAw.tXUtHUJYamDKtkYelQvDYvEIfw3JSdpGJT9oZvCpwYog.CdD8cLWVblKgtNU90YQb23SjW0erGN3CK1spo23PoJQg.JPEG.asdfgh2369/3472392068654157617_20211001005247786.jpg?type=w966")
            .centerCrop()
            .into(glide)
    }
}