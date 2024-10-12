package com.example.testcomposetask

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medicine_table")
data class MedicineEntity(
    @PrimaryKey val name: String,
    val dose: String,
    val strength: String
)