package com.surivalcoding.androidexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener(ClickImpl())
        // (v: View?) ->
        button.setOnClickListener {
            println("클릭")
        }
    }
}

class ClickImpl : OnClickListener {

    override fun onClick(v: View?) {
        println("클릭!!!!!!")
    }

}