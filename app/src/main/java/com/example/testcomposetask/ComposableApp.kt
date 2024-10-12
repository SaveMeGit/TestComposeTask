package com.example.testcomposetask

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testcomposetask.ui.GreetingScreen
import com.example.testcomposetask.ui.MedicineDetailScreen
import com.example.testcomposetask.ui.Screen

@Composable
fun ComposableApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screen.GreetingScreen.route) {
        composable(Screen.GreetingScreen.route) {
            GreetingScreen(navController, viewModel = MedicineViewModel())
        }
        composable(Screen.MedicineDetailScreen.route) { backStackEntry ->
            val medicineName = backStackEntry.arguments?.getString("medicineName")
            if (medicineName != null) {
                MedicineDetailScreen(medicineName)
            }
        }
    }
}