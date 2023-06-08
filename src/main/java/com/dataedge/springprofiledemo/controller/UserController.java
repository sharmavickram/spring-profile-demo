package com.dataedge.springprofiledemo.controller;

import com.dataedge.springprofiledemo.model.User;
import com.dataedge.springprofiledemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers() {
        return service.getUsers();
    }
}
