package com.example.todos.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todos.databinding.ToDoActivityBinding

class ToDoAdapter : RecyclerView.Adapter<TodoViewHolder>(){
    val toDoList = mutableListOf<ToDo>()
    fun updateList(list: List<ToDo>){
        toDoList.addAll(list)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return  TodoViewHolder(ToDoActivityBinding.inflate(LayoutInflater.from(parent.context),parent,false
        )
        )
    }
    fun insertJob(item: ToDo, position: Int){
        toDoList.add(position, item)
        notifyItemInserted(position)
    }


    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val toDoJob = toDoList [position]
        holder.doBind.ToDoJob.text = toDoJob.jobTitle
    }

    override fun getItemCount(): Int {
        return toDoList.size
    }
}
class TodoViewHolder(val doBind: ToDoActivityBinding):RecyclerView.ViewHolder(doBind.root)

data class ToDo(val jobTitle: String,)
