package com.example.examen.ViewModel

import android.util.Log
import com.example.examen.RecyclerView.MyItem
import com.example.examen.Retrofit.ItemAPI

class LogInRepository {

    private val api = ItemAPI.API()

    suspend fun createUser(emailInput: String, passwordInput: String) {
        return try {
            val response = api.createUser(reserva)
            if (response.isSuccessful) {
                response.body()
            } else {
                Log.e("NotesRepository", "Error HTTP: ${response.code()}")
                null
            }
        } catch (e: Exception) {
            Log.e("NotesRepository", "Error al crear nota", e)
            null
        }
    }
}