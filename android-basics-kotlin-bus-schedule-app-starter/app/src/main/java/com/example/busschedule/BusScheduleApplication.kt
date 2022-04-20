package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.AppDatabase

/*
 * Application 클래스의 맞춤 서브클래스를 제공하고
 * getDatabase()의 결과를 보유할 lazy 속성
 */
class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}