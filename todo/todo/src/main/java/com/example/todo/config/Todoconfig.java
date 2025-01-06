package com.example.todo.config;


import com.example.todo.dal.InMemoryTodoRepo;
import com.example.todo.dal.MongoTodoRepo;
import com.example.todo.dal.Todorepo;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Todoconfig {


    private String data;

    @Autowired
    private MongoTodoRepo mongoTodoRepo;

    @Autowired
    private InMemoryTodoRepo memoryTodoRepo;

    @Bean(name = "todoRepo")
    public Todorepo todoRepo() {
        if ("Database".equals(data)) {
            System.out.println("Data inside:" + data);
            return mongoTodoRepo; // Use mongoTodoRepo if data is "Database"
        }
        return memoryTodoRepo;
    }
}







