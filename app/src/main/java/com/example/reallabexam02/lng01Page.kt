package com.example.reallabexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class lng01Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lng01_page)



        val pageLogin = findViewById<MaterialButton>(R.id.startPageLogin)

        pageLogin.setOnClickListener{


            val intent5= Intent(this, HomePage::class.java)
            startActivity(intent5)
        }


        val pageSignup = findViewById<MaterialButton>(R.id.startPageSignup)

        pageSignup.setOnClickListener{
            val intent6=Intent(this, signInPage::class.java)
            startActivity(intent6)
        }
    }
}