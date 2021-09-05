package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        rollButton.setOnClickListener {
           rollDice()
        }
    }

    fun rollDice(){
        val randNumber = (1..6).random()

        val txtRandom = findViewById<TextView>(R.id.txt_view_rand_num)
        txtRandom.text = randNumber.toString()
    }
}