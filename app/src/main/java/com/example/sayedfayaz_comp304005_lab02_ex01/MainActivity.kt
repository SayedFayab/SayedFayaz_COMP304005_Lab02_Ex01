package com.example.sayedfayaz_comp304005_lab02_ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val enterBtn = findViewById<Button>(R.id.buttonEnter);

        enterBtn.setOnClickListener {

            intent = Intent(applicationContext, SelectProductActivity::class.java)

            startActivity(intent)

        }
    }
}


