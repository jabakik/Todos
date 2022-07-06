package com.example.todos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.todos.adapters.ToDo
import com.example.todos.adapters.ToDoAdapter
import com.example.todos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val doAdapter = ToDoAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ToDoRecyclerView.adapter = doAdapter


        val job : EditText = findViewById(R.id.WhatToDo)

        doAdapter.updateList(listOf(
            ToDo("Clean house" ),
            ToDo("DO homework"),
            ToDo("Buy groceries"),

            ))

        binding.Button.setOnClickListener {
            val jobAd = job.text.toString()
            doAdapter.insertJob(ToDo(jobAd),0)
        }


    }
}