package com.example.week6_app_shared_preferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = SharedPreferences(this)
        val btnSave = findViewById<Button>(R.id.btnSave)
        var etName = findViewById<EditText>(R.id.etName)

        btnSave.setOnClickListener {
            val name = etName.text.toString()


            //val name = "Hola"
            //grabo el texto en el shared Preferences
            sharedPreferences.save("name", name)
            Toast.makeText(this, "Data stored", Toast.LENGTH_LONG).show()
        }

        val btnRetrieve = findViewById<Button>(R.id.btnRetrieve)
        val tvRetrieve = findViewById<TextView>(R.id.tvRetrieve)
        btnRetrieve.setOnClickListener {
            if (sharedPreferences.getValue("name" )!= null){
                tvRetrieve.setText(sharedPreferences.getValue("name"))
            }
        }
    }
}