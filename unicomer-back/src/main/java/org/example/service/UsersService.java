package org.example.service;

import org.example.entity.User;

import java.util.List;

public interface UsersService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    String deleteUser(Long id);
}
