package com.mh.controller;

import com.mh.dto.UserDTO;
import com.mh.entity.User;
import com.mh.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service) { this.service = service; }

    @PostMapping("/register")
    public User register(@RequestBody UserDTO dto) {
        return service.register(new User(null, dto.getUsername(), dto.getPassword()));
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDTO dto) {
        User u = service.login(dto.getUsername(), dto.getPassword());
        return (u != null) ? "Login Successful" : "Invalid credentials";
    }

    @GetMapping
    public List<User> getAllUsers() { return service.getAllUsers(); }
}
