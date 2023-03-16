package com.example.security.service;

import com.example.security.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService(List<User> list) {
        list.add(new User("abc","abc@123","abc@gmail.com"));
        list.add(new User("xyz","xyz@123","xyz@gmail.com"));

    }

    //get all users
    public List<User> getAllUsers()
    {
        return  this.list;
    }

    //get the single user
    public User getUser(String username)

    {
        return this.list.stream().filter((user) ->user.getUsername().equals(username) ).findAny().orElse(null); //get();
    }

    //add new  user
    public User addUser(User user)
    {
        this.list.add(user);
        return user;
    }

}
