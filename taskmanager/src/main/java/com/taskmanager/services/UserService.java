package com.taskmanager.services;

import com.taskmanager.dto.UserRegisterDto;
import com.taskmanager.model.Users;
import com.taskmanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Users registerUser(UserRegisterDto userDto) {
        // Check if the username already exists
        if (userRepository.findByUsername(userDto.getUsername()) != null) {
            throw new IllegalArgumentException("Username already exists. Please choose a different username.");
        }

        // Create a new user and encode the password
        Users user = new Users();
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        try {
            return userRepository.save(user);
        } catch (Exception e) {
            throw new RuntimeException("User registration failed. Please try again later.", e);
        }
    }
}
