package com.murtaza.i210685

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)


        val imageButton11: ImageButton = findViewById(R.id.button11)
        imageButton11.setOnClickListener {
            val intent = Intent(this, MainActivity15::class.java)
            startActivity(intent)
        }


        val imageButton1: ImageButton = findViewById(R.id.button1)
        imageButton1.setOnClickListener {
            val intent = Intent(this, MainActivity16::class.java)
            startActivity(intent)
        }

    }
}