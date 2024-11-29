package com.example.list

import android.os.Bundle
import android.os.StrictMode.ThreadPolicy
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.asLiveData
import com.example.list.databinding.ActivityMainBinding
import kotlin.math.E

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = DataBase.getDB(this)
        db.GetDao().SelectAllAtem().asLiveData().observe(this){list ->
            binding.ReminderTextPlain.setText("")
            binding.TextTV.text = ""
            list.forEach(){

                val text = "Нагадування  ${it.ReminderTextUser}"
                binding.TextTV.append(text)
            }
        }
        binding.SaveButton.setOnClickListener{
            val item = Entity(
                null,
                binding.ReminderTextPlain.text.toString(),
            )

            Thread{
                db.GetDao().InsertAllItem(item)
            }.start()
        }
        binding.DeleteButton.setOnClickListener {
            Thread {
                db.GetDao().deleteAllUsers()
            }.start()
        }
    }
}