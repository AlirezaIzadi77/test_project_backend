package com.example.demo2.Controller;
import com.example.demo2.Model.roles;
import com.example.demo2.Service.rolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/roles")
public class rolesController {

    rolesService rolesService;

    @Autowired
    public rolesController(rolesService rolesService) {
        this.rolesService = rolesService;
    }

    @RequestMapping("/save")
    public roles saveTodos(@RequestBody roles roles){
        return rolesService.saveTodo(roles) ;
    }

    @RequestMapping("/findAll")
    public ArrayList<roles> showTodos(){
        return rolesService.findTodo() ;
    }



}
