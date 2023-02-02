package com.example.testing.model.database

import android.content.Context
import androidx.room.*
import com.example.testing.model.datamodel.Record

@Database(entities = [Record::class], version = 1, exportSchema = false)
abstract class RecordDatabase : RoomDatabase() {
    abstract fun recordDao(): RecordDao

    companion object {
        private var instance: RecordDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): RecordDatabase {
            if (instance == null) instance = Room.databaseBuilder(
                ctx.applicationContext, RecordDatabase::class.java, "record_database"
            ).build()
            return instance!!
        }



    }
}