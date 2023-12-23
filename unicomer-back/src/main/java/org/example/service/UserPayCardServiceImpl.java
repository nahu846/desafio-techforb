package org.example.service;

import org.example.entity.PayCard;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class UserPayCardServiceImpl implements UserPayCardService {
    @Override
    public List<PayCard> getUserPayCards(long userId) {
        return Arrays.asList(
                PayCard.builder()
                        .id(1L)
                        .numero(1234)
                        .saldo(BigDecimal.valueOf(300))
                        .build(),
                PayCard.builder()
                        .id(2L)
                        .numero(4321)
                        .saldo(BigDecimal.valueOf(1000))
                        .build()
        );
    }
}
