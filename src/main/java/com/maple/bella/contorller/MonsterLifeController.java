package com.maple.bella.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/MonsterLife")
public class MonsterLifeController {
    @GetMapping("/list")
    public String list(){
        return "MonsterLife/list";
    }
}
