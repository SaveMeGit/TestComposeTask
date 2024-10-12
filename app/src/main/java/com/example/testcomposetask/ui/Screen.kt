package com.example.testcomposetask.ui

sealed class Screen(val route: String) {
//    data object LoginScreen : Screen("login")
    data object GreetingScreen : Screen("greeting")
//    data object MedicineListScreen : Screen("medicine_list") // New screen for the medicine list
    data object MedicineDetailScreen : Screen("medicine_detail/{medicineName}") {
        fun createRoute(medicineName: String): String {
            return "medicine_detail/$medicineName"
        }
    }
}