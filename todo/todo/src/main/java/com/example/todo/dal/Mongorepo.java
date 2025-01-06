package com.example.todo.dal;

import com.example.todo.model.Todomodel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mongorepo extends MongoRepository <Todomodel,String> {
}
