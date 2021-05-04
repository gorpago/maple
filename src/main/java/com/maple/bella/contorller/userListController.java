package com.maple.bella.contorller;

import com.maple.bella.dao.userListDao;
import com.maple.bella.model.userList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String update(@ModelAttribute userList userModel, Model model){
        service.update(userModel);

        return "/index";
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