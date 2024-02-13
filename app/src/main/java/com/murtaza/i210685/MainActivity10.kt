package com.murtaza.i210685

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }



        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
        }

    }
}