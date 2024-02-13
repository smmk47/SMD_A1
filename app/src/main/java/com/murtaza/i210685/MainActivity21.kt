package com.murtaza.i210685

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main21)



        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this, MainActivity22::class.java)
            startActivity(intent)
        }

        val imageButton3: ImageButton = findViewById(R.id.imageButton3)
        imageButton3.setOnClickListener {
            val intent = Intent(this, MainActivity23::class.java)
            startActivity(intent)
        }
    }
}