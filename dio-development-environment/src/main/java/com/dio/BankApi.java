package com.dio;

import com.dio.entity.User;
import com.dio.service.StatementService;
import com.dio.service.StatementServiceImpl;

import java.util.UUID;

public class BankApi {

    public static void main(String[] args) {
        final User userA = new User(UUID.randomUUID(), "Usuario 1");
        final User userB = new User(UUID.randomUUID(), "Usuario 2");
        final StatementService statementService = new StatementServiceImpl(userA, userB);

        statementService.findAllByUser(userA).forEach(System.out::println);
        statementService.findAllByUser(userB).forEach(System.out::println);
    }
}