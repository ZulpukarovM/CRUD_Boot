package com.example.CRUD_Boot.dao;


import com.example.CRUD_Boot.model.User;

import java.util.List;

public interface UserDao {
    void add (User user);
    void update(User user);
    void delete (long id);
    List<User> getAllUsers();
    User getUser(long id);

}