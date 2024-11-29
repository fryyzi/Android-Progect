package com.example.sports

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Button: Button = findViewById(R.id.LoginButton)
        val Login: TextView = findViewById(R.id.LoginPalinText)
        val Password: TextView = findViewById(R.id.PasswordPlainText)
        val Wellcome: TextView = findViewById(R.id.EnterLoginText)
        val NoAccountText: TextView = findViewById(R.id.NoAccount)


        Button.alpha = 0f
        Login.alpha = 0f
        Password.alpha = 0f
        NoAccountText.alpha = 0f

        Password.animate().alpha(1f).translationYBy((-50).toFloat()).setStartDelay(300).duration = 1500
        Login.animate().alpha(1f).translationYBy((-50).toFloat()).setStartDelay(300).duration = 1500
        Password.animate().alpha(1f).translationYBy((-50).toFloat()).setStartDelay(300).duration = 1500
        Button.animate().alpha(1f).translationYBy((50).toFloat()).setStartDelay(300).duration = 1500

        Wellcome.animate().alpha(1f).translationYBy((50).toFloat()).setStartDelay(300).duration = 1500
        NoAccountText.animate().alpha(1f).translationYBy((50).toFloat()).setStartDelay(300).duration = 1500


        NoAccountText.setOnClickListener(){
            val RegisterIntent = Intent(this, Register::class.java)
            startActivity(RegisterIntent)
        }
    }
}