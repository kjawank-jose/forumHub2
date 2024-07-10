package com.kjawank.forumapp.ForumAppApplication.controller;

import com.kjawank.forumapp.ForumAppApplication.model.User;
import com.kjawank.forumapp.ForumAppApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    // Otros métodos de controlador
}
