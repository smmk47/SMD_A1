package com.murtaza.i210685

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)



        val buttonvid: Button = findViewById(R.id.button)

        buttonvid.setOnClickListener {
            val intent = Intent(this, MainActivity17::class.java)
            startActivity(intent)
        }


        val buttoncam: Button = findViewById(R.id.button19)

        buttoncam.setOnClickListener {
            val intent = Intent(this, MainActivity17::class.java)
            startActivity(intent)
        }
    }
}