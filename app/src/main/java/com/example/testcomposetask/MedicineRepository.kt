package com.example.testcomposetask

import retrofit2.Call
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MedicineRepository @Inject constructor(
    private val apiService: MedicineApiService,
    private val medicineDao: MedicineDao
) {
    fun getMedicines(): Call<List<Medicine>> = apiService.getMedicines()

    fun getSavedMedicines() = medicineDao.getAllMedicines()

    fun insertMedicine(medicine: MedicineEntity) {
        medicineDao.insertMedicine(medicine)
    }
}
