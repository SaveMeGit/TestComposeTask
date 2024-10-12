//package com.example.testcomposetask
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//
//class MedicineViewModelFactory(private val repository: MedicineRepository) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(com.example.testcomposetask.MedicineViewModel::class.java)) {
//            return com.example.testcomposetask.MedicineViewModel() as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}