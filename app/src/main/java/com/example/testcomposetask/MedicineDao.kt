package com.example.testcomposetask

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MedicineDao {
    @Query("SELECT * FROM medicine_table")
    fun getAllMedicines(): List<MedicineEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMedicine(medicine: MedicineEntity)
}