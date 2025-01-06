package com.example.todo.controller;

import com.example.todo.model.Todomodel;
import com.example.todo.services.Todoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

@RestController
public class Todocontroller {
    @Autowired
    Todoservice tservice;

    @GetMapping("/todos")
    public List<Todomodel> getTodoController(){
        return tservice.getTodoService();
    }
    @PostMapping("/todo")
    public Todomodel createTodoController(@RequestBody Todomodel todoEntry){
        return tservice.createTodoService(todoEntry);
    }
    @PutMapping("/todo/{id}")
    public Todomodel updateTodocontroller(@PathVariable String id,@RequestBody Todomodel todoEntry){
        return tservice.updateTodoService(todoEntry,id);
    }
    @DeleteMapping("/todo/{id}")
    public String deleteTodoController(@PathVariable String id){
        return tservice.deleteTodoService(id);
    }
}
