package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var diceImage : ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

//        val countButton: Button = findViewById(R.id.countup_button)
//        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
//        val resultText: TextView = findViewById(R.id.result_Text)
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()
//        resultText.text = randomInt.toString()
    }

//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_Text)
//        val number = 1
//        if(resultText.text == "Hello World!"){
//            resultText.text = number.toString()
//            return
//        }
//        if (resultText.text.toString().toInt() < 6) {
//            var i = resultText.text.toString().toInt() + number
//            Toast.makeText(
//                this, "button clicked",
//                Toast.LENGTH_SHORT
//            ).show()
//            resultText.text = i.toString()
//        }
//
//    }
}