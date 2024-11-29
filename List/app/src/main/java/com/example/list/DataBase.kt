package com.example.list

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Entity::class], version = 1)
abstract class DataBase: RoomDatabase() {

    abstract fun GetDao(): Dao

    companion object{
        fun getDB(context: Context): DataBase{
            return Room.databaseBuilder(
                context.applicationContext,
                DataBase::class.java,
                "Reminder.db"
            ).build()
        }
    }
}