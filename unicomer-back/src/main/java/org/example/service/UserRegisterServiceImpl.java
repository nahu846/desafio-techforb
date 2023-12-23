package org.example.service;

import org.example.controller.Credential;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public Boolean register(User user) {
        userRepository.save(user);
        return true;
    }
}
