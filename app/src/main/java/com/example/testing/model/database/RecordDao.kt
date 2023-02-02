package com.example.testing.model.database

import androidx.room.*
import com.example.testing.model.datamodel.Record


@Dao
interface RecordDao {
    @Query("SELECT * FROM record")
    fun getAll(): List<Record>

    @Query("SELECT * FROM record WHERE id IN (:recordIds)")
    fun loadAllByIds(recordIds: IntArray): List<Record>

    @Query("SELECT * FROM record WHERE name LIKE :name LIMIT 1")
    fun findByName(name: String): Record

    @Insert
    fun insertAll(vararg record: Record)

    @Insert
    fun insert(record: Record)
    @Delete
    fun delete(record: Record)
}