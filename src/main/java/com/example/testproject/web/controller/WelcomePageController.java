package com.example.testproject.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomePageController {

    @GetMapping
    public String getWelcomePage(){
        return "WelcomePage";
    }

    //@PostMapping
    //public String postWelcomePage(){
    //    if (name = "Sign Up") {
    //        return "redirect:/signUp";
    //    } else if (value = "Sign In") {
    //        return "redirect:/signIn";
    //    }

    //}

}

