package com.example.reallabexam02


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val appStart = findViewById<Button>(R.id.startApp)

        appStart.setOnClickListener{
            val intent1=Intent(this, lng01Page::class.java)
            startActivity(intent1)
        }
    }

}


