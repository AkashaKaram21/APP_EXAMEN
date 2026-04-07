package com.example.examen

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.examen.ViewModel.LogInViewModel

class LogIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val etUsuari = findViewById<TextView>(R.id.etUsuari)
        val etPassword = findViewById<TextView>(R.id.etPassword)

        etPassword.ferLogIn{
            //passar el arguments
        }

    }

}