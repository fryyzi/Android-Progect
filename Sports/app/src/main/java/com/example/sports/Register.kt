package com.example.sports

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Gmail: TextView = findViewById(R.id.RegEnterGmail)
        val Login: TextView = findViewById(R.id.RegEnterLogin)
        val Password: TextView = findViewById(R.id.RegEnterPassword)
        val Button: Button = findViewById(R.id.RegisterButtonLogin)

        val Account: TextView = findViewById(R.id.YesAccount)

        Gmail.alpha = 0f
        Login.alpha = 0f
        Password.alpha = 0f
        Button.alpha = 0f

        Gmail.animate().alpha(1f).translationYBy((-50).toFloat()).setStartDelay(300).duration = 1500
        Login.animate().alpha(1f).translationYBy((-50).toFloat()).setStartDelay(300).duration = 1500
        Password.animate().alpha(1f).translationYBy((-50).toFloat()).setStartDelay(300).duration = 1500
        Button.animate().alpha(1f).translationYBy((50).toFloat()).setStartDelay(300).duration = 1500


        Account.setOnClickListener(){
            val Register_intent = Intent(this, MainActivity::class.java)
            startActivity(Register_intent)
        }

    }
}