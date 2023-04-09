package com.example.testproject.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pageForUser")
public class PageForUser {

    @GetMapping
    public String getPageForUser(){
        return "PageForUser";
    }

}
