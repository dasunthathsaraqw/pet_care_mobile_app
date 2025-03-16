package com.example.reallabexam02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DoctorActivity : AppCompatActivity() {

    private lateinit var doctorRecyclerView: RecyclerView
    private lateinit var doctorAdapter: DoctorAdapter
    private val doctorsList = mutableListOf<Doctor>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        // Step 1: Link RecyclerView
        doctorRecyclerView = findViewById(R.id.doctorRecyclerView)
        doctorRecyclerView.layoutManager = LinearLayoutManager(this)

        // Step 2: Add Data
        doctorsList.apply {
            add(
                Doctor(
                    rank = 1,
                    name = "Dr. John Doe",
                    specialty = "Veterinary Surgeon",
                    rating = 4.8,
                    petsTreated = 320,
                    description = "Experienced vet with 10+ years.",
                    imageResId = R.drawable.doctor_placeholder // Ensure this drawable exists
                )
            )
            add(
                Doctor(
                    rank = 2,
                    name = "Dr. Lisa Smith",
                    specialty = "Animal Nutritionist",
                    rating = 4.7,
                    petsTreated = 280,
                    description = "Specialist in pet nutrition and health.",
                    imageResId = R.drawable.doctor_placeholder
                )
            )
        }

        // Step 3: Setup Adapter
        doctorAdapter = DoctorAdapter(this, doctorsList)
        doctorRecyclerView.adapter = doctorAdapter
    }
}
