package com.maple.bella.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/superAdmin")
public class superAdminController {
    @GetMapping("/list")
    public String list(Model model){
        return "superAdmin/list";
    }
}
