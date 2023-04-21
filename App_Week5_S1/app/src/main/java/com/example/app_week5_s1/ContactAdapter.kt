package com.example.app_week5_s1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactAdapter(var contacts: ArrayList<Contact>): RecyclerView.Adapter<ContactPrototype>() {
    //Mostrar (inflar) la data en el prototype
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactPrototype {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prototype_contact, parent, false)
        return ContactPrototype(view)
    }

    //Vincular la data con el adapter
    override fun onBindViewHolder(holder: ContactPrototype, position: Int) {
        holder.bind(contacts.get(position))
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

}

class ContactPrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvTelephone = itemView.findViewById<TextView>(R.id.tvTelephone)

    fun bind(contact: Contact) {
        tvName.text = contact.name
        tvTelephone.text = contact.telephone
    }

}
