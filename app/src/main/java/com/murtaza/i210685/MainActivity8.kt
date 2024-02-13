package com.murtaza.i210685

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val button18: Button = findViewById(R.id.backButtfdon)

        button18.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }


        val forgotPasswordText: TextView = findViewById(R.id.onne)
        forgotPasswordText.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }
    }
}