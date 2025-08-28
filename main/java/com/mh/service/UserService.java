package com.mh.service;

import com.mh.entity.User;
import com.mh.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) { this.repo = repo; }

    public User register(User user) { return repo.save(user); }

    public User login(String username, String password) {
        User u = repo.findByUsername(username);
        if (u != null && u.getPassword().equals(password)) {
            return u;
        }
        return null;
    }

    public List<User> getAllUsers() { return repo.findAll(); }
}
