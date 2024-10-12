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
    var credentials by mutableStateOf(Credentials())

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