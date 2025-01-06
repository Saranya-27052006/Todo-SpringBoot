package com.example.todo.dal;

import com.example.todo.model.Todomodel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.MergeOperation.UniqueMergeId.id;


@Component
public class InMemoryTodoRepo implements Todorepo{
    HashMap <String, Todomodel> todoMap;

    InMemoryTodoRepo() {
        System.out.println("InMemoryCons");
        todoMap = new HashMap<>();
    }
    public List<Todomodel> getAllTodos() {
        ArrayList<Todomodel> arrayList = new ArrayList<>(todoMap.values());
        return arrayList;
    }

    public Todomodel createTodo(Todomodel todo_entry) {
        todoMap.put(todo_entry.getId(), todo_entry);
        return todo_entry;
    }

    public Todomodel updateTodo(Todomodel todo_entry,String id) {
        todoMap.remove(id);
        todoMap.put(id,todo_entry);
        return todo_entry;
    }

    public String deleteTodo(String id) {
        todoMap.remove(id);
        return id;
    }
}
