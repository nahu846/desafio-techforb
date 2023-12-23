package org.example.service;

import org.example.entity.UserTransaction;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserTransactionService {
    List<UserTransaction> getUserTransactions(long userId, int count);
}
