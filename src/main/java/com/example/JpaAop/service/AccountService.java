package com.example.JpaAop.service;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public void transferMoney(long fromAccount, long toAccount, double amount) {
        // Business logic for transferring money
        System.out.println("Transferred $" + amount + " from account " + fromAccount + " to " + toAccount);
    }
}

