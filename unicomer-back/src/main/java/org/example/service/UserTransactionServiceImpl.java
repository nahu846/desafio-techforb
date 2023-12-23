package org.example.service;

import org.example.entity.TransactionType;
import org.example.entity.UserTransaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class UserTransactionServiceImpl implements UserTransactionService {
    @Override
    public List<UserTransaction> getUserTransactions(long userId, int count) {

        return Arrays.asList(
                UserTransaction.builder()
                        .id(1L)
                        .transactionType(TransactionType.DEPOSITO)
                        .amount(BigDecimal.valueOf(120))
                        .timeStamp(new Date())
                        .build(),
                UserTransaction.builder()
                        .id(2L)
                        .transactionType(TransactionType.EXTRACCION)
                        .amount(BigDecimal.valueOf(44))
                        .timeStamp(new Date())
                        .build()
        );
    }
}
