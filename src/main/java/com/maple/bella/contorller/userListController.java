package com.maple.bella.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class userListController {

    @Autowired
    userListDao service;

    @GetMapping("/list")
    public String list(Model model){

        model.addAttribute("dataList", service.selectList());

        return "user/list";
    }

    @PostMapping("/update")
    public void update(@ModelAttribute userList userModel, Model model){
        service.update(userModel);
    }

    @PostMapping("/monUpdate")
    public String monUpdate(Model model){
        service.monUpdate();
        return "user/list";
    }

    @PostMapping("/monInit")
    public String monInit(Model model){
        service.monInit();
        return "user/list";
    }
}