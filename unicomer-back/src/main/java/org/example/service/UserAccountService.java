package org.example.service;

import java.math.BigDecimal;

public interface UserAccountService {

    String transfer(long userId, BigDecimal amount, long targetId);
    String extract(long userId, BigDecimal amount);
    String deposit(long userId, BigDecimal amount);
}
