package org.example.controller;

import org.example.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin( maxAge = 3600)
@RestController
@RequestMapping("/api/users/login")
public class LoginController {
    @Autowired
    private UserLoginService userLoginService;
    @PostMapping
    public Boolean login(@RequestBody Credential credential) {
        return userLoginService.login(credential);
    }
}
