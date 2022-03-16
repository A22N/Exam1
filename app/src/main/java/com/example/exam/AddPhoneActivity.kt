package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exam.databinding.ActivityAddPhoneBinding
import com.example.exam.recyclerview.Phone

class AddPhoneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddPhoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.save.setOnClickListener {
            val name = binding.editName.text.toString()
            val number = binding.editNumber.text.toString()

            val phone = Phone(name, number)

            MainActivity.Phones.add(phone)


            finish()
        }
    }
}
