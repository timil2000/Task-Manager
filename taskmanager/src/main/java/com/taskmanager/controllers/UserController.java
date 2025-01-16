package com.taskmanager.controllers;

import com.taskmanager.dto.UserRegisterDto;
import com.taskmanager.model.Users;
import com.taskmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody UserRegisterDto userDto) {
        return userService.registerUser(userDto);
    }
}
