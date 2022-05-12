package com.najdimu.tasbeehdigital

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.content.res.ResourcesCompat
import com.najdimu.tasbeehdigital.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var count = 1
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCounter.setOnClickListener {
            binding.counterNum.setText(count.toString())
            count++
        }
        binding.btnReset.setOnClickListener {
            binding.counterNum.setText("0")
            count=1
        }


    }
}