package com.monkey1024.intercepter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/add")
    public String add(){
        System.out.println("wuzhiqiangdashuaige");
        return "add";
    }
}
