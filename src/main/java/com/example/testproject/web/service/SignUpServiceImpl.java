package com.example.testproject.web.service;

import com.example.testproject.web.model.Account;
import com.example.testproject.web.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private final AccountRepository accountRepository;
    @Autowired
    private final PasswordEncoder passwordEncoder;

    public SignUpServiceImpl(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void SignUp(String firstName, String lastName, String email, String password) {
        Account account = Account.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(passwordEncoder.encode(password))
                .role(Account.Role.USER)
                .state(Account.State.NOT_CONFIRMED)
                .build();

        accountRepository.save(account);
    }
}
