package com.example.app_week5_s1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var contacts = ArrayList<Contact>()

    //creamos el adapter
    var contactAdapter = ContactAdapter(contacts)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadContacts()
        initView()
    }

    private fun initView() {
        val rvContact = findViewById<RecyclerView>(R.id.rvContact)

        rvContact.adapter = contactAdapter
        rvContact.layoutManager = LinearLayoutManager(this)
    }

    private fun loadContacts() {
        contacts.add(Contact("Americo", "123456789"))
        contacts.add(Contact("Alan", "123456789"))
        contacts.add(Contact("Abel", "123456789"))
        contacts.add(Contact("Jose", "123456789"))
        contacts.add(Contact("Carrillo", "123456789"))
    }
}