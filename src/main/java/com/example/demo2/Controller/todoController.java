package com.example.demo2.Controller;
import com.example.demo2.Model.todo;
import com.example.demo2.Service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/roles")
public class todoController {
    todoService todoService ;

    @Autowired
    public todoController(todoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/save")
    public todo saveTodos(@RequestBody todo todo){
        return todoService.saveTodo(todo) ;
    }


    @RequestMapping("/findAll")
    public ArrayList<todo> showTodos(){
        return todoService.findTodo() ;
    }



}
