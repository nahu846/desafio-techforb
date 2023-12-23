package org.example.service;

import java.math.BigDecimal;

public interface UserBalanceService {
    BigDecimal getBalance(long userId);

}
