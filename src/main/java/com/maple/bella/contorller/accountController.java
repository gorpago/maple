package com.maple.bella.contorller;

import com.maple.bella.model.user;
import com.maple.bella.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class accountController {

    @Autowired
    private userService service;

    @GetMapping("/login")
    public String login(){
        return "account/login";
    }

    @GetMapping("/register")
    public String REG(){
        return "account/register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute user mo){
        service.insert(mo);
        return "redirect:/account/login";
    }
}
