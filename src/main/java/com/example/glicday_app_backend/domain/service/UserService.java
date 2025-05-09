package com.example.glicday_app_backend.domain.service;

import com.example.glicday_app_backend.domain.UserDTO;
import com.example.glicday_app_backend.domain.entities.UserEntity;
import com.example.glicday_app_backend.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserEntity createUser(UserDTO user) {
        UserEntity newUser = new UserEntity();
        newUser.setName(user.name());
        userRepository.save(newUser);
        return newUser;
    }

    // Buscar usuário por ID
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);  // Retorna null caso o usuário não seja encontrado
    }


}
