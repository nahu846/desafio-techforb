package org.example.controller;

import org.example.entity.OptionType;
import org.example.entity.PayCard;
import org.example.entity.UserTransaction;
import org.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersAccountController {
    @Autowired
    private UserBalanceService userBalanceService;
    @Autowired
    private UserTransactionService userTransactionService;
    @Autowired
    private UserPayCardService userPayCardService;
    @Autowired
    private UserMenuOptions userMenuOptions;

    @Autowired
    private UserAccountService userAccountService;


    @GetMapping("/{userId}/balance")
    private BigDecimal getBalance(@PathVariable long userId) {
        return userBalanceService.getBalance(userId);
    }
    @GetMapping("/{userId}/transactions/count/{count}")
    private List<UserTransaction> getUserTransactions(@PathVariable long userId, @PathVariable int count) {
        return userTransactionService.getUserTransactions(userId, count);
    }
    @GetMapping("/{userId}/paycards")
    private List<PayCard> getUserPayCard(@PathVariable long userId) {
        return userPayCardService.getUserPayCards(userId);
    }
    @GetMapping("/{userId}/menuoptions")
    private List<OptionType> getUserMenuOptions(@PathVariable long userId) {
        return userMenuOptions.getUserMenuOptions(userId);
    }

    @GetMapping("/{userId}/transfer/{amount}{targetId}")
    private String transfer(@PathVariable long userId, @PathVariable BigDecimal amount, @PathVariable long targetId) {
        return userAccountService.transfer(userId, amount, targetId);
    }
    @GetMapping("/{userId}/extract/{amount}")
    private String extract(@PathVariable long userId, @PathVariable BigDecimal amount) {
        return userAccountService.extract(userId, amount);
    }
    @GetMapping("/{userId}/deposit/{amount}")
    private String deposit(@PathVariable long userId, @PathVariable BigDecimal amount) {
        return userAccountService.deposit(userId, amount);
    }
}
