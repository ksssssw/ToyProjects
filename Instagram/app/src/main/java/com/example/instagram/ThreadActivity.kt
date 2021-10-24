package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class ThreadActivity : AppCompatActivity() {
//    private var mBinding: ActivityMainBinding? = null // 전역으로 바인딩 객체 생성
//    private val binding get() = mBinding!! // 매번 null 체크할필요 없이 변수 재 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_thread)
//        mBinding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }
        }
        val thread: Thread = Thread(runnable)


        }
    }
