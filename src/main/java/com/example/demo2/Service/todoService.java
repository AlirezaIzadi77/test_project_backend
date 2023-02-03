package com.example.demo2.Service;

import com.example.demo2.Model.todo;
import com.example.demo2.Repository.todoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class todoService {
    todoRepository todoRepository ;

    @Autowired
    public todoService(todoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public ArrayList<todo> findTodo() {
        return (ArrayList<todo>) todoRepository.findAll();
    }


    public todo saveTodo(todo todo) {
        return todoRepository.save(todo);
    }
}
