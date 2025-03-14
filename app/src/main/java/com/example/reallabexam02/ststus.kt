package com.example.reallabexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ststus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ststus)


        var perinfo = findViewById<Button>(R.id.perInfo)

        perinfo.setOnClickListener(){
            var intent6 = Intent(this,myProfile::class.java)
            startActivity(intent6)
        }
    }
}