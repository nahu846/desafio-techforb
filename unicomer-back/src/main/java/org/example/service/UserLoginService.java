package org.example.service;

import org.example.controller.Credential;
import org.springframework.stereotype.Service;

public interface UserLoginService {
    Boolean login(Credential credential);
}
