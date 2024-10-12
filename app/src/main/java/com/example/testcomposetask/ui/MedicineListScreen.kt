package com.example.testcomposetask.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.testcomposetask.MedicineViewModel

@Composable
fun MedicineListScreen(navController: NavController, viewModel: MedicineViewModel) {
    val medicines = viewModel.medicines
    val isLoading = viewModel.isLoading.value

    Column(modifier = Modifier.fillMaxSize()) {
        if (isLoading) {
            CircularProgressIndicator()
        } else {
            LazyColumn {
                items(medicines.size) { medicine ->
                    MedicineCard(medicines[medicine]) {
                        navController.navigate(Screen.MedicineDetailScreen.createRoute(medicines[medicine].toString()))
                    }
                }
            }
        }
    }
}