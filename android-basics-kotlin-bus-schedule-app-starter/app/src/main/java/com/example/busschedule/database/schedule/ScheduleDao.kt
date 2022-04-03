package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/*
 * DAO는 데이터 엑세스 객체를 나타내며 데이터 엑세스 권한을 제공하는 클래스임
 * 특히 DAO에는 데이터를 읽고 조작하는 함수가 포함됨
 */
@Dao
interface ScheduleDao {

    /*
     * 첫 번째 화면
     * 버스 정류장이 도착 시간에 따라 오름차순으로 표시
     */
    @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
    fun getAll(): Flow<List<Schedule>>

    /*
     * 모든 열 선택
     */
    @Query("SELECT * FROM schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
    fun getByStopName(stopName: String): Flow<List<Schedule>>
}