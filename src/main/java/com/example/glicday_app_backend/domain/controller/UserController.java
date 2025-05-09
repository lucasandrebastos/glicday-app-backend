package com.example.glicday_app_backend.domain.controller;


import com.example.glicday_app_backend.domain.UserDTO;
import com.example.glicday_app_backend.domain.entities.UserEntity;
import com.example.glicday_app_backend.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {



    @Autowired
    private UserService userService;

    // Criar usuário
    @PostMapping
    public UserEntity createUser(@RequestBody UserDTO user) {
        return userService.createUser(user);
    }

    // Buscar usuário por ID
    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
