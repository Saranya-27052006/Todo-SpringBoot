package com.example.todo.dal;

import com.example.todo.model.Todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Primary
public class MongoTodoRepo implements Todorepo {
    @Autowired
    private Mongorepo mrepo;

    public List<Todomodel> getAllTodos() {
        System.out.println("Get repo:");
        return mrepo.findAll();
    }

    public Todomodel createTodo(Todomodel todo_entry) {
        return mrepo.save(todo_entry);
    }

    public Todomodel updateTodo(Todomodel todo_entry, String id) {
        Todomodel oldentry = mrepo.findById(id).get();
        oldentry.setTitle(todo_entry.getTitle());
        oldentry.setDescription(todo_entry.getDescription());
        return mrepo.save(oldentry);
    }

    public String deleteTodo(String id) {
        mrepo.deleteById(id);
        return "Deleted Successfully";
    }
}











