package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@Document(collection = "todos")
@NoArgsConstructor
@AllArgsConstructor
public class Todomodel {
    private String id;
    private String title;
    private String description;
}
