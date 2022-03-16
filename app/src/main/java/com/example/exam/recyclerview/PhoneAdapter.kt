package com.example.exam.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PhoneAdapter(
    private val listPhones: List<Phone>
) : RecyclerView.Adapter<PhoneHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PhoneHolder.from(parent)

    override fun onBindViewHolder(holder: PhoneHolder, position: Int) {
        holder.bind(listPhones[position])
    }

    override fun getItemCount() = listPhones.size
}
