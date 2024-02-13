package com.murtaza.i210685

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)


        val button18: Button = findViewById(R.id.button18)

        button18.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

        val button16: Button = findViewById(R.id.button16)
        button16.setOnClickListener {
            val intent = Intent(this, MainActivity24::class.java)
            startActivity(intent)
        }
        val button20: Button = findViewById(R.id.button20)
        button20.setOnClickListener {
            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }

        val button211: Button = findViewById(R.id.button211)
        button211.setOnClickListener {
            val intent = Intent(this, MainActivity21::class.java)
            startActivity(intent)
        }

        val button22: Button = findViewById(R.id.button22)
        button22.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }


        val viewCardBottom1: View = findViewById(R.id.viewCardBottom1)

        viewCardBottom1.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }


    }
}