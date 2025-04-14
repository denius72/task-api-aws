package com.denisu.task_api_aws.model

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val dueDate: String,
    val status: String,
    val fileUrl: String? = null
)
