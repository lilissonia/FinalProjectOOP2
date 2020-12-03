package com.ekalilis.tugaseoop2

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(DaftarMenu::class), version = 1)
abstract class DaftarMenuRoomDatabase : RoomDatabase() {
    abstract fun DaftarMenuDao(): DaftarMenuDao

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
        applicationContext,
        DaftarMenuRoomDatabase::class.java, "DBCS"
    ).build()

}