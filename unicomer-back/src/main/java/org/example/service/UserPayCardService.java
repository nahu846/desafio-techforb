package org.example.service;

import org.example.entity.PayCard;

import java.util.List;

public interface UserPayCardService {
    List<PayCard> getUserPayCards(long userId);
}
