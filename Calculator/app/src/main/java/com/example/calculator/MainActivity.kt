package com.example.calculator

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

        val Button_1 = findViewById<Button>(R.id.button_1)
        val Button_2: Button = findViewById(R.id.button_2)
        val Button_3: Button = findViewById(R.id.button_3)
        val Button_4: Button = findViewById(R.id.button_4)
        val Button_5: Button = findViewById(R.id.button_5)
        val Button_6:Button = findViewById(R.id.button_6)
        val Button_7: Button = findViewById(R.id.button_7)
        val Button_8: Button = findViewById(R.id.button_8)
        val Button_9: Button = findViewById(R.id.button_9)
        val Button_0: Button = findViewById(R.id.button_0)
        val Button_Clear: Button = findViewById(R.id.Button_Clear)
        val Button_Result: Button = findViewById(R.id.button_00)

        val Text: TextView = findViewById(R.id.ResultPlain)

        var number_One: Int = 0
        var number_Two: Int = 0
        var number_tree: Int = 0
        var function: String = ""

        val Button_Plus: Button = findViewById(R.id.button_Plus)
        val Button_Minus: Button = findViewById(R.id.button_min)
        val Button_Multiplication: Button = findViewById(R.id.button_Multiplication)
        val Button_Division: Button = findViewById(R.id.button_Division)

        var Result: TextView = findViewById(R.id.ResultPlain)

        var Resulte: Int = 0

        Button_Clear.setOnClickListener(){
            Text.text = ""
        }

        Button_Plus.setOnClickListener(){
            function = "+"
        }
        Button_Minus.setOnClickListener(){
            function = "-"
        }
        Button_Multiplication.setOnClickListener(){
            function = "*"
        }
        Button_Division.setOnClickListener(){
            function = "/"
        }



        Button_1.setOnClickListener {
            if(number_One == 0)
                number_One = 1
            else
                number_tree = 1
        }
        Button_2.setOnClickListener {
            if(number_Two == 0){
                number_Two = 2
            }
            else{
                number_tree = 2
            }
        }
        Button_3.setOnClickListener(){
            if(number_One == 0){
                number_One = 3
            }
            else{
                number_tree = 3
            }
        }
        Button_4.setOnClickListener(){
            if(number_Two == 0){
                number_Two = 4
            }
            else{
                number_tree = 4
            }
        }
        Button_5.setOnClickListener(){
            if(number_One == 0){
                number_One = 5
            }
            else{
                number_tree = 5
            }

        }
        Button_6.setOnClickListener(){
            if(number_Two == 0){
                number_Two = 6
            }
            else{
                number_tree = 6
            }

        }
        Button_7.setOnClickListener(){
            if(number_One == 0){
                number_One = 7
            }
            else{
                number_tree = 7
            }

        }
        Button_8.setOnClickListener(){
            if(number_Two == 0){
                number_Two = 8
            }
            else{
                number_tree = 8
            }
        }
        Button_9.setOnClickListener(){
            if(number_One == 0){
                number_One = 9
            }
            else{
                number_tree = 9
            }
        }
       //Button_0.setOnClickListener(){
        //    number_Two = 0
        //}


        Button_Result.setOnClickListener {
            if(function == "+"){
                if(number_One > number_Two || number_Two > number_One){
                    Resulte = number_One + number_Two
                }
                if(number_One == number_One && number_Two == 0){
                    Resulte = number_One + number_One
                }
                if(number_Two == number_Two && number_One == 0){
                    Resulte = number_Two + number_Two
                }
                if(number_tree > 0 && number_One > 0){
                    Resulte = number_tree + number_One
                }
                if(number_tree > 0 && number_Two > 0){
                    Resulte = number_tree + number_Two
                }
            }
            if(function == "-"){
                if(number_One > number_Two){
                    Resulte = number_One - number_Two
                }
                if(number_One > number_tree && number_Two == 0){
                    Resulte = number_One - number_tree
                }
                if(number_Two > number_tree && number_One == 0){
                    Resulte = number_Two - number_tree
                }
            }
            if(function == "*"){
                if(number_One > number_Two || number_Two > number_One){
                    Resulte = number_One * number_Two
                }
                if(number_One == number_One && number_Two == 0){
                    Resulte = number_One * number_One
                }
                if(number_Two == number_Two && number_One == 0){
                    Resulte = number_Two * number_Two
                }
                if(number_tree > 0 && number_One > 0){
                    Resulte = number_tree * number_One
                }
                if(number_tree > 0 && number_Two > 0){
                    Resulte = number_tree * number_Two
                }
            }
            if (function == "/") {
                if (number_Two != 0) {
                    Resulte = number_One / number_Two
                }
                // Додаткові перевірки
                if (number_One != 0) {
                    Resulte = number_One / number_One
                }

                if (number_Two != 0) {
                    Resulte = number_Two / number_Two
                }

                if (number_tree > 0 && number_One > 0) {
                    Resulte = number_tree / number_One
                }

                if (number_tree > 0 && number_Two > 0) {
                    Resulte = number_tree / number_Two
                }
            }


            Result.text = Resulte.toString()
            number_Two = 0
            number_One = 0
            number_tree = 0
            function = "0"
        }
    }
}