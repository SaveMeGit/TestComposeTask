package com.example.testcomposetask.ui

import com.example.testcomposetask.Medicine
import com.example.testcomposetask.MedicineEntity

sealed class Screen(val route: String) {
    data object GreetingScreen : Screen("greeting")
    data object MedicineDetailScreen : Screen("medicine_detail/{medicineName}") {
        fun createRoute(medicine: Medicine): String {
            return "medicine_detail/${medicine.name}"
        }
    }
}