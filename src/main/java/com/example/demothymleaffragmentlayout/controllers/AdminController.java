package com.example.demothymleaffragmentlayout.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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



    @GetMapping("/dashboard1-ajax")
    public String getFragmentContentFromDB1(Model model) {

        model.addAttribute("new_orders", 10_000_000);

        return "admin/dashboard::dashboard1";

    }

    @GetMapping("/dashboard2-ajax")
    public String getFragmentContentFromDB2() {




        return "admin/dashboard::dashboard2";

    }
}
