package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 첫번째 방법
        val ment = resources.getString(R.string.hello);
        Log.d("ment", "ment : " + ment)

        // 두번째 방법
        val ment2 = getString(R.string.hello)
        Log.d("ment", "ment2 : " + ment2)
    }
}