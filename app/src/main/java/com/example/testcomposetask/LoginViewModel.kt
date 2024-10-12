package com.example.testcomposetask

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.testcomposetask.Constants.userName

class LoginViewModel : ViewModel() {
//    private val _email = MutableStateFlow("")
//    val email: StateFlow<String> = _email

//    private val _password = MutableStateFlow("")
//    val password: StateFlow<String> = _password

//    private val _errorMessage = MutableStateFlow("")
//    val errorMessage: StateFlow<String> = _errorMessage

    var credentials by mutableStateOf(Credentials())

//    fun onEmailChanged(newEmail: String) {
//        _email.value = newEmail
//    }

//    fun onPasswordChanged(newPassword: String) {
//        _password.value = newPassword
//    }

    fun updateLogin(newLogin: String) {
        credentials = credentials.copy(login = newLogin)
    }

    fun updatePassword(newPassword: String) {
        credentials = credentials.copy(pwd = newPassword)
    }

    fun login(context: Context) {
        if (!checkCredentials(context)) {
            credentials = Credentials()
        }
    }

    private fun checkCredentials(context: Context): Boolean {
        return if (credentials.isNotEmpty() /*&& credentials.login == "admin"*/) {
            userName = credentials.login
            context.startActivity(Intent(context, MainActivity::class.java))
            true
        } else {
            Toast.makeText(context, "Wrong Credentials", Toast.LENGTH_SHORT).show()
            false
        }
    }
}