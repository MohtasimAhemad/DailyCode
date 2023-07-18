package com.example.task.controller;

import com.example.task.model.Result;
import com.example.task.model.User;
import com.example.task.service.ResultService;
import com.example.task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final ResultService resultService;

    @Autowired
    public UserController(UserService userService, ResultService resultService) {
        this.userService = userService;
        this.resultService = resultService;
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/result/{id}")
    public Result getCandidateResult(@PathVariable String id) {
        return resultService.getResultById(id);
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{username}")
    public User editUser(@PathVariable String username, @RequestBody User user) {
        User existingUser = userService.getUserByUsername(username);
        if (existingUser != null) {
            existingUser.setUsername(user.getUsername());
            existingUser.setPassword(user.getPassword());
            existingUser.setRole(user.getRole());
            return userService.editUser(existingUser);
        }
        return null;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
