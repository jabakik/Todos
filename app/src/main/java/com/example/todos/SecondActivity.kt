package com.example.todos

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.todos.databinding.ToDoActivityBinding

class SecondActivity: AppCompatActivity() {
    private lateinit var binding1: ToDoActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding1 = ToDoActivityBinding.inflate(layoutInflater)
        setContentView(binding1.root)

        binding1.ToDoJob.setOnClickListener {
            binding1.True.visibility = View.VISIBLE
        }
    }
}