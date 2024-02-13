package com.murtaza.i210685

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val loginButton: Button = findViewById(R.id.button14)

        // Set OnClickListener to handle the button click event
        loginButton.setOnClickListener {
            // Create an Intent to navigate to the SignupActivity
            val intent = Intent(this, MainActivity2::class.java)

            // Start the SignupActivity
            startActivity(intent)
        }
    }
}