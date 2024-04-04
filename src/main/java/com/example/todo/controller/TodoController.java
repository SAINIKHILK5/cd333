/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 */

// Write your code here

package com.example.todo.controller;

import com.example.todo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import com.example.todo.model.Todo;

@RestController
public class TodoController {
    @Autowired
    public TodoH2Service ts;

    @GetMapping("/todos")

    public ArrayList<Todo> getTodos() {
        return ts.getTodos();
    }

    @GetMapping("/todos/{todoId}")
    public Todo getTodoByid(@PathVariable("todoId") int todoId) {
        return ts.getTodoById(todoId);
    }
}