package com.example.testcomposetask

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.awaitResponse
import javax.inject.Inject

class MedicineViewModel : ViewModel() {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiService = retrofit.create(MedicineApiService::class.java)

    val medicines = mutableStateListOf<Medicine>()
    val isLoading = mutableStateOf(true)

    fun loadMedicines() {
        viewModelScope.launch {
            try {
                val response = apiService.getMedicines().awaitResponse()

                if (response.isSuccessful) {
                    medicines.clear()
                    medicines.addAll(response.body() ?: emptyList())

                    Log.d("API Success", "Medicines fetched: ${medicines.size}")
                } else {
                    Log.e("API Error", "Response Code: ${response.code()}")
                }
            } catch (e: Exception) {
                Log.e("API Exception", "Error fetching data: ${e.message}")
                e.printStackTrace()
            } finally {
                isLoading.value = false
            }
        }
    }

}
