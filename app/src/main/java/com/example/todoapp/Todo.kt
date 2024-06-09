package com.example.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    val id: Int,
    val title: String,
    val createdDate: Date
)

fun getTodoItem(): List<Todo>{

    return listOf<Todo>(
        Todo(1,"First",Date.from(Instant.now())),
        Todo(2,"Second",Date.from(Instant.now())),
    )


}

