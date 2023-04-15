package com.example.testproject.web.controller;

import com.example.testproject.web.config.security.AccountUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/signIn")
public class SignInController {
    @Autowired
    private final AccountUserDetailsService accountUserDetailsService;
    @Autowired
    public SignInController(AccountUserDetailsService accountUserDetailsService) {
        this.accountUserDetailsService = accountUserDetailsService;
    }
    @GetMapping
    public String getSignInPage(Authentication authentication){
        if(authentication != null) {
            if (authentication.getAuthorities().stream()
                    .anyMatch(a -> a.getAuthority().equals("ADMIN"))) {
                return "redirect:/pageForAdmin";
            }
            return "redirect:/pageForUser";
        }
        return "SignIn";
    }