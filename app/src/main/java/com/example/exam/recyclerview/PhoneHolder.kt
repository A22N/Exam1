package com.example.exam.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.databinding.ItemPhoneBinding

class PhoneHolder private constructor(
    private val binding: ItemPhoneBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): PhoneHolder {
            val binding = ItemPhoneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return PhoneHolder(binding)
        }
    }

    fun bind(phone: Phone) {
        binding.name.text = phone.name
        binding.number.text = phone.number
    }
}
