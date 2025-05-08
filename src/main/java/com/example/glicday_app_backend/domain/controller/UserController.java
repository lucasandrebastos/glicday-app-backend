package com.example.glicday_app_backend.domain.controller;


import com.example.glicday_app_backend.domain.entities.UserEntity;
import com.example.glicday_app_backend.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public Optional<UserEntity> getUser(@PathVariable Integer userId){
        return userService.getUser(userId);

    };

}
