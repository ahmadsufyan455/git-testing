package com.zerodev.awesomeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zerodev.awesomeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // add magic here
        val firstNumber = binding.num1.text
        val secondNumber = binding.num2.text

        binding.btnCalculate.setOnClickListener {
            val result = firstNumber.toString().toInt() + secondNumber.toString().toInt()
            binding.tvResult.text = result.toString()
        }
    }
}