package com.example.testcomposetask.ui.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.testcomposetask.Constants

@Composable
fun MedicineDetailScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.statusBars.asPaddingValues()) // Adds margin for status bar
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        Text(text = "Medicine Details", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Name: ${Constants.medicineName}", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Dose: ${Constants.medicineDose}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Strength: ${Constants.medicineStrength}", style = MaterialTheme.typography.bodySmall)
    }
}