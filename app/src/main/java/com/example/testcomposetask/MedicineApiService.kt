package com.example.testcomposetask

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path


interface MedicineApiService {
    @GET("todos/") // Use the correct endpoint
    fun getMedicines(): Call<List<Medicine>>

}