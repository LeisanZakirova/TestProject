package com.example.testproject.web.service;

import com.example.testproject.web.model.Account;

public class SignUpServiceImpl implements SignUpService {
    @Override
    public void SignUp(String firstName, String lastName, String email, String password) {
        Account account = Account.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();

        System.out.println("Аккаунт создан");
        System.out.println("Email" + email);
        System.out.println("Password" + password);
    }
}
