package org.example.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserBalanceServiceImpl implements UserBalanceService {
    @Override
    public BigDecimal getBalance(long userId) {
        return BigDecimal.valueOf(20);
    }
}
