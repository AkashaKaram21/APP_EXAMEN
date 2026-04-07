package com.example.examen.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LogInViewModel : ViewModel() {
    private val repo = LogInRepository()
    val message = MutableLiveData<String>()

    fun ferLogIn(emailInput: String, passwordInput: String) {
        viewModelScope.launch {
            val created = repo.ferLogIn(emailInput, passwordInput)
            if (created != null) {
                message.value = "Fet Log In!"
                loadLogIN()
            } else {
                message.value = "Error fent log In!"
            }

        }
    }

}