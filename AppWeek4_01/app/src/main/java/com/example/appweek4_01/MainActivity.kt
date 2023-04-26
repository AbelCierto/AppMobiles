package com.example.appweek4_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESS ="com.example.appweek4_01"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view : View){
        val editText = findViewById<EditText>(R.id.etName)
        val message = editText.text.toString()

        var intent = Intent(this, DisplayMessage::class.java).apply {
            putExtra(EXTRA_MESS, message)
        }

        startActivity(intent)
    }
}