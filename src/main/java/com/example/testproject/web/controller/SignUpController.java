package com.example.testproject.web.controller;

import com.example.testproject.web.service.SignUpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/signUp")
public class SignUpController {

    @Autowired
    private final SignUpServiceImpl signUpServiceImpl;
    @Autowired
    public SignUpController(SignUpServiceImpl signUpServiceImpl) {
        this.signUpServiceImpl = signUpServiceImpl;
    }

    @GetMapping
    public String getSignUp(){
        return "SignUp";
    }

    @PostMapping
    public String signUp(@RequestParam String firstName,
                         @RequestParam String lastName,
                         @RequestParam String email,
                         @RequestParam String password){
        signUpServiceImpl.SignUp(firstName, lastName, email, password);
        return "redirect:/";
    }

}
