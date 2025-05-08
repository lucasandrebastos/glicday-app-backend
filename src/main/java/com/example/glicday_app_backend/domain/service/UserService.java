package com.example.glicday_app_backend.domain.service;

import com.example.glicday_app_backend.domain.entities.UserEntity;
import com.example.glicday_app_backend.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public Optional<UserEntity> getUser(Integer id){
        return userRepository.findById(id);
    }


}
