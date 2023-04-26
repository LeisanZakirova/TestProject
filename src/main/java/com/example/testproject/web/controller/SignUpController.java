package com.example.testproject.web.controller;

import com.example.testproject.web.model.Account;
import com.example.testproject.web.service.SignUpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import javax.validation.Valid;

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
    public String getSignUp(Model model){
        model.addAttribute("signUpForm", new Account());
        return "SignUp";
    }

    @PostMapping
    public String signUp(@Valid Account account, BindingResult bindingResult, Model model,
                         @RequestParam String firstName,
                         @RequestParam String lastName,
                         @RequestParam String email,
                         @RequestParam String password){
        if(bindingResult.hasErrors()) {
            model.addAttribute(account);
            return "SignUp";
        }
        signUpServiceImpl.SignUp(firstName, lastName, email, password);
        return "redirect:/";
    }
}
