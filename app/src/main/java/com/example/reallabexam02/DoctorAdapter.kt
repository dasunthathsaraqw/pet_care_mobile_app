package com.example.reallabexam02

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DoctorAdapter(
    private val context: Context,
    private val doctorsList: MutableList<Doctor> // Changed to MutableList for dynamic updates
) : RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder>() {

    class DoctorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val doctorRank: TextView = itemView.findViewById(R.id.doctorRank)
        val doctorImage: ImageView = itemView.findViewById(R.id.doctorImage)
        val doctorName: TextView = itemView.findViewById(R.id.doctorName)
        val doctorSpecialty: TextView = itemView.findViewById(R.id.doctorSpecialty)
        val doctorRating: TextView = itemView.findViewById(R.id.doctorRating)
        val petsTreated: TextView = itemView.findViewById(R.id.petsTreated)
        val appointmentButton: Button = itemView.findViewById(R.id.appointmentButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_doctor_card, parent, false)
        return DoctorViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoctorViewHolder, position: Int) {
        val doctor = doctorsList[position]
        holder.doctorRank.text = "Rank #${doctor.rank}"
        holder.doctorImage.setImageResource(doctor.imageResId) // Set image
        holder.doctorName.text = doctor.name
        holder.doctorSpecialty.text = doctor.specialty
        holder.doctorRating.text = "⭐ ${doctor.rating}"
        holder.petsTreated.text = "Pets Treated: ${doctor.petsTreated}"

        // Handle Appointment Button Click
        holder.appointmentButton.setOnClickListener {
            Toast.makeText(context, "Appointment booked with ${doctor.name}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = doctorsList.size
}
