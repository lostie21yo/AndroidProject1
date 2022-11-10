package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    val const:Double = 2.0 // неизменяямая константа
    var counter:Int = 0 // изменяемая переменная
    var res:Double = 0.0
    var bool:Boolean = "Привет, всему миру!".endsWith("миру!!")
    lateinit var tv : TextView // var tv : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tvTest)
        Log.d("TestLog", bool.toString())
    }

    fun onClickTest(view: View){
        counter += 1
        res = const.pow(counter)
        tv.text = res.toString()
    }

    fun onClickErase(view: View) {
        res = 0.0
        counter = 0
        tv.text = "Erased!"
    }
}