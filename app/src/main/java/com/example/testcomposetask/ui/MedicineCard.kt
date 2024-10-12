package com.example.testcomposetask.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.testcomposetask.Medicine

@Composable
fun MedicineCard(medicine: Medicine, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Name: ${medicine.name}", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Dose: ${medicine.dose}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Strength: ${medicine.strength}", style = MaterialTheme.typography.bodySmall)
        }
    }
}