package com.manikbora.passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manikbora.passingdata.databinding.ActivityInputBinding
import java.security.acl.LastOwnerException

class InputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInputBinding
    private val FIRST_NAME_KEY = "FIRST_NAME_KEY"
    private val LAST_NAME_KEY = "LAST_NAME_KEY"
    private var firstName = ""
    private var lastName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSubmit.setOnClickListener {
                firstName = etFirstName.text.toString().trim().uppercase()
                lastName = etLastName.text.toString().trim().uppercase()

                val intent = Intent(applicationContext, ResultActivity::class.java)
                intent.putExtra(FIRST_NAME_KEY, firstName)
                intent.putExtra(LAST_NAME_KEY, lastName)
                startActivity(intent)

            }
        }

    }
}