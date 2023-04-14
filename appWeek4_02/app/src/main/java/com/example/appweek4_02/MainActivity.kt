package com.example.appweek4_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var questions : ArrayList<Question>
    var position = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadQuestions()
        setUpViews()

    }

    private fun loadQuestions() {
        questions = ArrayList()
        var question = Question("Es Buenos Aires capital de Argentina?", true)
        questions.add(question)
        questions.add(Question("El professor se llama David Quevedo?", true))
        questions.add(Question("Patricia ensenia algoritmos?", false))
        questions.add(Question("Es bueno dormir tarde?", false))
        questions.add(Question("Piero es delegado de complejidad?", true))
    }

    private fun setUpViews() {
        val btSi = findViewById<Button>(R.id.btAnswer1)
        val btNo = findViewById<Button>(R.id.btAnswer2)
        var tvQuestion = findViewById<TextView>(R.id.tvQuestion)

        btSi.setOnClickListener {
            if (questions[position].answer){
                Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show()
            }

        }

        btNo.setOnClickListener {
            if (!questions[position].answer){
                Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_LONG).show()
            }
        }


        tvQuestion.text = questions[position].sentence




        val btNext = findViewById<Button>(R.id.btNext)

        btNext.setOnClickListener {
            if (position < questions.size - 1){
                position += 1
            }
            else {
                position = 0
            }

            tvQuestion.text = questions[position].sentence
        }


    }


}