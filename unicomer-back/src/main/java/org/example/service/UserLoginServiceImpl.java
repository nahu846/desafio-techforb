package org.example.service;

import org.example.controller.Credential;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public Boolean login(Credential credential) {
        try {
            userRepository.findByCredential(credential.getDni(), credential.getSecret()).orElseThrow();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
