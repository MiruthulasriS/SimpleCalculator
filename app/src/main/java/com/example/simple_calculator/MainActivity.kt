package com.example.simple_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1EditText = findViewById<EditText>(R.id.num1)
        val number2EditText = findViewById<EditText>(R.id.num2)
        val resultTextView = findViewById<TextView>(R.id.resultTV)
        val addButton = findViewById<Button>(R.id.addBtn)
        val subtractButton = findViewById<Button>(R.id.subBtn)
        val multiplyButton = findViewById<Button>(R.id.mulBtn)
        val divideButton = findViewById<Button>(R.id.divBtn)

        addButton.setOnClickListener {
            val result = number1EditText.text.toString().toDouble() +
                    number2EditText.text.toString().toDouble()
            resultTextView.text = "Result: $result"
        }

        subtractButton.setOnClickListener {
            val result = number1EditText.text.toString().toDouble() -
                    number2EditText.text.toString().toDouble()
            resultTextView.text = "Result: $result"
        }

        multiplyButton.setOnClickListener {
            val result = number1EditText.text.toString().toDouble() *
                    number2EditText.text.toString().toDouble()
            resultTextView.text = "Result: $result"
        }

        divideButton.setOnClickListener {
            val divisor = number2EditText.text.toString().toDouble()
            if (divisor != 0.0) {
                val result = number1EditText.text.toString().toDouble() / divisor
                resultTextView.text = "Result: $result"
            } else {
                resultTextView.text = "Cannot divide by zero"
            }
        }
    }
}