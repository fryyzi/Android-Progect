package com.example.list

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow



@Dao
interface Dao {
    @Insert()
    fun InsertAllItem(item: Entity)
    @Query("SELECT * FROM Reminder")
    fun SelectAllAtem(): Flow<List<Entity>>
    @Query("DELETE FROM Reminder")
    fun deleteAllUsers()

}