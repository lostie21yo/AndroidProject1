package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.project1.databinding.ActivityMainBinding
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    val a : Float = 5.0f
    val b : Float = 64.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.tv.text = "$a и $b"

        bindingClass.b1.setOnClickListener{
            bindingClass.tv.text = (a + b).toString()
        }
        bindingClass.b2.setOnClickListener{
            bindingClass.tv.text = (a - b).toString()
        }
        bindingClass.b3.setOnClickListener{
            bindingClass.tv.text = (a * b).toString()
        }
    }

}