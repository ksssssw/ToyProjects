package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class PhoneBookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_detail)
        val back : ImageView = findViewById(R.id.back)

        getPersonInfo()

        back.setOnClickListener{
            onBackPressed()
        }

    }

    fun getPersonInfo(){
        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("number")

        val person_detail_name : TextView = findViewById<TextView>(R.id.person_detail_name)
        val person_detail_number : TextView = findViewById<TextView>(R.id.person_detail_number)

        person_detail_name.setText(name)
        person_detail_number.setText(number)
    }
}