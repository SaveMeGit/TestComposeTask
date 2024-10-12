//package com.example.testcomposetask
//
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.BlendMode.Companion.Screen
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//
//@Composable
//fun MedicineList(navController: NavController, username: String, viewModel: com.example.testcomposetask.MedicineViewModel) {
//    LaunchedEffect(Unit) {
//        viewModel.loadMedicines()
//    }
//
//    val medicines by viewModel.medicines
//    val isLoading by viewModel.isLoading
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Top
//    ) {
//        Text(text = "Hello, $username!", modifier = Modifier.padding(16.dp))
//
//        if (isLoading) {
//            CircularProgressIndicator() // Show loading indicator
//        } else {
//            LazyColumn {
//                items(medicines) { medicine ->
//                    MedicineCard(medicine) {
//                        navController.navigate(Screen.MedicineDetailScreen.createRoute(medicine))
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun UserItem(user: Medicine) {
//    Surface(
//        shape = MaterialTheme.shapes.medium,
//        shadowElevation = 4.dp,
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Column(modifier = Modifier.padding(16.dp)) {
//            Text(text = user.name, style = MaterialTheme.typography.bodyLarge)
//            Text(text = user.dose, style = MaterialTheme.typography.bodyMedium)
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun UserItemPreview() {
//    UserItem(user = Medicine(name = "John Doe", dose = "", strength = "john@example.com"))
//}
//
//@Composable
//fun MedicineCard(medicine: Medicine, onClick: () -> Unit) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth() // Make the card take the full width of the parent
//            .padding(8.dp) // Add padding around the card
//            .clickable { onClick() }, // Handle click events
//        elevation = CardDefaults.cardElevation() // Shadow effect for the card
//    ) {
//        Column(
//            modifier = Modifier.padding(16.dp) // Padding inside the card
//        ) {
//            Text(text = "Name: ${medicine.name}", style = MaterialTheme.typography.headlineLarge) // Medicine name
//            Text(text = "Dose: ${medicine.dose}", style = MaterialTheme.typography.bodyMedium) // Medicine dose
//            Text(text = "Strength: ${medicine.strength}", style = MaterialTheme.typography. bodySmall) // Medicine strength
//        }
//    }
//}