package com.example.demo2.Service;

import com.example.demo2.Model.roles;
import com.example.demo2.Repository.rolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class rolesService {
    rolesRepository rolesRepository;

    @Autowired
    public rolesService(rolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public ArrayList<roles> findTodo() {
        return (ArrayList<roles>) rolesRepository.findAll();
    }


    public roles saveTodo(roles roles) {
        return rolesRepository.save(roles);
    }
}
