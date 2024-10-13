package com.example.testcomposetask.ui.compose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.testcomposetask.Constants
import com.example.testcomposetask.MedicineViewModel
import com.example.testcomposetask.R

@Composable
fun GreetingScreen(viewModel: MedicineViewModel, findNavController: NavController) {
    val medicines = viewModel.medicines
    val isLoading by remember { viewModel.isLoading }

    LaunchedEffect(Unit) {
        viewModel.loadMedicines()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.statusBars.asPaddingValues()) // Adds margin for status bar
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        val hour = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY)
        val greeting = when {
            hour < 12 -> "Good Morning!"
            hour < 17 -> "Good Afternoon!"
            else -> "Good Evening!"
        }

        val string = greeting + "\n" + Constants.userName
        Text(text = string, style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        if (isLoading) {
            CircularProgressIndicator()
        } else {
            LazyColumn {
                items(medicines.size) { medicine ->
                    MedicineCard(medicines[medicine]) {
                        findNavController.navigate(R.id.action_greetingsFragment_to_medicineDetailsFragment)
                    }
                }
            }
        }
    }
}
