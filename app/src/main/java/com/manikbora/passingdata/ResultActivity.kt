package com.manikbora.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manikbora.passingdata.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    private var firstName = ""
    private var lastName = ""
    private var fullName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            firstName = intent.getStringExtra("FIRST_NAME_KEY").toString()
            lastName = intent.getStringExtra("LAST_NAME_KEY").toString()
            fullName = firstName.plus(" ").plus(lastName)
            tvUserName.text = fullName
        }

    }
}