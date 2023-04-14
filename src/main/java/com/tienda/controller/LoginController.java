package com.tienda.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
    
    @GetMapping("/login")
    public String index(){
        return "/login";
    }
}
