package com.example.security.controller;


import com.example.security.model.User;
import com.example.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;



    // all users
    @GetMapping("/")
    public List<User> getAllUsers()
    {
        return this.userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username)
    {
        return this.userService.getUser(username);
    }

    @PostMapping("/")
    public  User add(@RequestBody User user)
    {
        return this.userService.addUser(user);
    }
}
