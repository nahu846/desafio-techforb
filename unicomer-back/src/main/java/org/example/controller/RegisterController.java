package org.example.controller;

import org.example.entity.User;
import org.example.service.UserLoginService;
import org.example.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin( maxAge = 3600)
@RestController
@RequestMapping("/api/users/register")
public class RegisterController {

    @Autowired
    private UserRegisterService userRegisterService;
    @PostMapping
    public Boolean login(@RequestBody User user) {
        return userRegisterService.register(user);
    }
}
