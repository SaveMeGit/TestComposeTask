package com.example.testcomposetask

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://pastebin.com/jKVv22p8/problems/") // Base URL for the API
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideMedicineApiService(retrofit: Retrofit): MedicineApiService {
        return retrofit.create(MedicineApiService::class.java)
    }

//    @Provides
//    fun provideMedicineRepository(apiService: MedicineApiService): MedicineRepository {
//        return MedicineRepository(apiService)
//    }
}