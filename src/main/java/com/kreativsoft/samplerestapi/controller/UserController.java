package com.kreativsoft.samplerestapi.controller;

import com.kreativsoft.samplerestapi.entity.User;
import com.kreativsoft.samplerestapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/user")
    public List<User> getUsers(){
        return (List<User>) service.findAll();
    }
}
