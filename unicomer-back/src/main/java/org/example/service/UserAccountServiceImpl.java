package org.example.service;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public String transfer(long userId, BigDecimal amount, long targetId) {
        String result = extract(userId, amount);
        if (result.equals("ok")) {
            return deposit(userId, amount);
        }
        return result;
    }

    @Override
    public String extract(long userId, BigDecimal amount) {
        try {
            User user = userRepository.findById(userId).orElseThrow();
            BigDecimal balance = user.getAccountBalance();
            if (balance.compareTo(amount) >= 0) {
                user.setAccountBalance(balance.subtract(amount));
                userRepository.save(user);
                return "ok";
            }
            return "insufficient founds";
        } catch (NoSuchElementException e) {
            return "wrong data";
        }
    }

    @Override
    public String deposit(long userId, BigDecimal amount) {
        try {
            User user = userRepository.findById(userId).orElseThrow();
            BigDecimal balance = user.getAccountBalance();
            user.setAccountBalance(balance.add(amount));
            userRepository.save(user);
            return "ok";
        } catch (NoSuchElementException e) {
            return "wrong data";
        }
    }
}
