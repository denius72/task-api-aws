package com.denisu.task_api_aws

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.denisu.task_api_aws.adapter.TaskAdapter
import com.denisu.task_api_aws.databinding.ActivityMainBinding
import com.denisu.task_api_aws.model.Task

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val taskList = mutableListOf<Task>()
    private lateinit var adapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = TaskAdapter(taskList)
        binding.recyclerTasks.layoutManager = LinearLayoutManager(this)
        binding.recyclerTasks.adapter = adapter

        //preparar tela de criação
        binding.btnAddTask.setOnClickListener {
        }
    }
}