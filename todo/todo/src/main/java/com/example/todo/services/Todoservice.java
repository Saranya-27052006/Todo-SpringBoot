package com.example.todo.services;


import com.example.todo.dal.Todorepo;
import com.example.todo.model.Todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Todoservice {
    Todorepo repo;

    @Autowired
    public Todoservice(@Qualifier("todoRepo") Todorepo repo){
        this.repo = repo;
        System.out.println("Service constructor: ");
    }
    public List<Todomodel>getTodoService(){
        System.out.println("Service get:");
        return repo.getAllTodos();
    }
    public Todomodel createTodoService(Todomodel todo_entry) {
        return repo.createTodo(todo_entry);
    }
    public Todomodel updateTodoService(Todomodel todo_entry,String id) {
        return repo.updateTodo(todo_entry, id);
    }
    public String deleteTodoService(String id){
        return repo.deleteTodo(id);

    }


}
