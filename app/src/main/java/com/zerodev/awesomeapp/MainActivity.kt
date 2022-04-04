package com.zerodev.awesomeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.zerodev.awesomeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCenter.start(
            application, BuildConfig.APP_SECRET,
            Analytics::class.java, Crashes::class.java
        )

        // add magic here
        val firstNumber = binding.num1.text
        val secondNumber = binding.num2.text

        // add another magic
        binding.btnCalculate.setOnClickListener {
            val result = firstNumber.toString().toInt() + secondNumber.toString().toInt()
            binding.tvResult.text = result.toString()
        }
    }
}