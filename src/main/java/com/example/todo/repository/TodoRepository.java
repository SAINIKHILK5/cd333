package com.example.todo.repository;

import java.util.*;
import com.example.todo.model.*;

public interface TodoRepository {
    public ArrayList<Todo> getTodos();

    public Todo getTodoById(int todoId);

    public Todo addTodo(Todo t1);
}