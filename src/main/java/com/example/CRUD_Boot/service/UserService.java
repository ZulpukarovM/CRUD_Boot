package com.example.CRUD_Boot.service;

import com.example.CRUD_Boot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void add (User user);
    void update(long id, String name, String lastName, int age);
    void delete (long id);
    List<User> getAllUsers();
    User getUser(long id);
}
