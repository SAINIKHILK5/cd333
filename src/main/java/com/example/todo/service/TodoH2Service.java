/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.jdbc.core.JdbcTemplate;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.*;
 *
 */

// Write your code here

package com.example.todo.service;

import com.example.todo.model.Todo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.todo.repository.*;
import com.example.todo.model.TodoRowMapper;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@Service
public class TodoH2Service implements TodoRepository {
    @Autowired
    private JdbcTemplate db;

    @Override

    public ArrayList<Todo> getTodos() {
        List<Todo> l1 = db.query("select * from TODOLIST", new TodoRowMapper());
        ArrayList<Todo> a1 = new ArrayList<>(l1);
        return a1;
    }

    @Override

    public Todo getTodoById(int todoId) {
        try {
            Todo t1 = db.queryForObject("select * from TODOLIST where id = ?", new TodoRowMapper(), todoId);
            return t1;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override

    public Todo addTodo(Todo t1) {
            
            db.update("Insert into TODOLIST () ")
    }

}