package com.example.testcomposetask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testcomposetask.ui.theme.TestComposeTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

//        val repository = MedicineRepository()
//        val com.example.testcomposetask.MedicineViewModel = ViewModelProvider(this, MedicineViewModelFactory(repository))
//            .get(com.example.testcomposetask.MedicineViewModel::class.java)

        setContent {
            MyApp()

//            TestComposeTaskTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = userName + "!" + "\nToday is " + getFormattedSystemTime(),
//                        modifier = Modifier.padding(innerPadding)
//                    )
//
//                    MedicineList(viewModel = com.example.testcomposetask.MedicineViewModel)
//                }
//            }
        }
    }

//    private fun getFormattedSystemTime(): String {
//        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val current = LocalDateTime.now()
//            val formatter = DateTimeFormatter.ofPattern("EEEE, yyyy-MM-dd HH:mm:ss")
//            current.format(formatter)
//        } else {
//            val dateFormat = SimpleDateFormat("EEEE, yyyy-MM-dd HH:mm:ss", Locale.getDefault())
//            val date = Date()
//            dateFormat.format(date)
//        }
//    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "Hello $name",
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true, device = "id:Nexus One", showSystemUi = true)
@Composable
fun GreetingPreview() {
    TestComposeTaskTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true, device = "id:Nexus One", showSystemUi = true)
@Composable
fun GreetingPreviewDark() {
    TestComposeTaskTheme(darkTheme = true) {
        Greeting("Android")
    }
}