package com.jwt.backend.controller;


import com.jwt.backend.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private List<User> users = new ArrayList<>(List.of(
            new User(1,"chathush","vishmika","chathush@gmail.com","user","password")
    ));

    @GetMapping("/getAllUsers")
    public List<User> getUsers(){
        return users;
    }

}
