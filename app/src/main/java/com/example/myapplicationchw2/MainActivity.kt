package com.example.myapplicationchw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = 0
        var value = 0
        var nakami = "Life is tech!"
        val TextView = findViewById<TextView>(R.id.textView)
        TextView.setText(number.toString())
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            number = number + 1
            TextView.setText(number.toString())

        }
        when {
            value == 0 -> {
                TextView.setText(number.toString() + nakami)
            }
            value == 1 -> {
                nakami = "名古屋土曜"
                TextView.setText(number.toString() + nakami)

            }
            value == 2 -> {
                nakami = "Androidコース"
                TextView.setText(number.toString() + nakami)

            }
            else -> {
                nakami ="あみだ班"
                TextView.setText(number.toString() + nakami)
            }


        }
    }
}