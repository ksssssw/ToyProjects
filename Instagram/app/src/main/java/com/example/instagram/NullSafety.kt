package com.example.instagram

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class NullSafety : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number: Int = 10
        val number1: Int? = null

//        val number5 = :Int = number1!!+10 // null임을 보장하는건데 잘 사용 안함..

//        val number3 = number? + number1
        val number3 = number1?.plus(number) // null 될거임
        Log.d("number", "number3 : $number3")

        // 삼항연산자 -> 엘비스 연산자라고 코틀린에서는 한다.
        val number4 = number1 ?: 10
        Log.d("number", "number4 : $number4")

    }

    fun plus(a: Int, b: Int?): Int? {
        return b?.plus(a)
    }
}