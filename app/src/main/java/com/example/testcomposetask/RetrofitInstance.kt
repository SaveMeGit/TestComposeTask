//package com.example.testcomposetask
//
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//object RetrofitInstance {
//    val api: MedicineApiService by lazy {
//        Retrofit.Builder()
//            .baseUrl("https://pastebin.com/jKVv22p8/problems/") // Example API
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(MedicineApiService::class.java)
//    }
//}