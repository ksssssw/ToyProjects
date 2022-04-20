package com.example.busschedule.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.busschedule.database.schedule.Schedule
import com.example.busschedule.database.schedule.ScheduleDao


/*
 * AppDabase는 다음 작업을 실행한다.
 * 1. 데이터베이스에서 정의되는 항목을 가져온다.
 * 2. 각 Dao 클래스의 단일 인스턴스 액세스 권한을 제공한다.
 * 3. 데이터베이스 미리 채우기와 같은 추가 설정을 실행한다.
 */
@Database(entities = arrayOf(Schedule::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    // 데이터베이스 클래스를 통해 다른 클래스에 쉽게 엑세스 가능
    abstract fun scheduleDao(): ScheduleDao

    // 인스턴스는 컴패니언 객체에 저장되며 기존 인스턴스를 반환하거나 데이터베이스를 처음으로 만드는 메서드가 필요함
    // 컴페니언 객체에 정의됨
    companion object {
        @Volatile // volatile속성은 버그를 방지하기 위해 appdatabase 인스턴스에 사용하는것이 좋음
        private var INSTANCE: AppDatabase? = null

        /*
         * 이미 있는 경우 기존 인스턴스 반환
         * 필요하다면 처음으로 데이터베이스를 만든다.
         * createFromAsset()를 호출하여 기존 데이터를 로드한다.
         */
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "app_database"
                )
                    .createFromAsset("database/bus_schedule.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}