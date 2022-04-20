package com.example.inventory.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
    @Query("SELECT * FROM item WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    @Query("SELECT * FROM item ORDER BY name ASC")
    fun getItems(): Flow<List<Item>>

    /*
     * 데이터베이스 작업은 실행에 시간이 오래 걸릴 수 있으므로 별도의 스레드에서 실행한다.
     * 따라서 함수를 정지함수로 만들어 코루틴에서 호출할 수 있게 한다.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)
}