package com.murtaza.i210685


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Find the button by its ID
        val signupButton: Button = findViewById(R.id.signupButton)

        // Set OnClickListener to handle the button click event
        signupButton.setOnClickListener {
            // Create an Intent to navigate to the SignupActivity
            val intent = Intent(this, MainActivity3::class.java)

            // Start the SignupActivity
            startActivity(intent)
        }

        // Find the button by its ID
        val loginButton: Button = findViewById(R.id.loginButton)

        // Set OnClickListener to handle the button click event
        loginButton.setOnClickListener {
            // Create an Intent to navigate to the SignupActivity
            val intent = Intent(this, MainActivity7::class.java)

            // Start the SignupActivity
            startActivity(intent)
        }

        val forgotPasswordTextView: TextView = findViewById(R.id.textView66)
        forgotPasswordTextView.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }



    }
}