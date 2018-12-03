package com.example.demothymleaffragmentlayout.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping(value = {"/", "/home", "/admin", "/index"})
    public String adminPage() {
        return "admin/index";
    }

    @GetMapping(value = {"/user"})
    public String userPage() {
        return "admin/user";
    }
}
