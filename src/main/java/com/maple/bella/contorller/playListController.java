package com.maple.bella.contorller;

import com.maple.bella.dao.playDao;
import com.maple.bella.model.play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/playList")
public class playListController {

    @Autowired
    private playDao dao;


    @GetMapping("/list")
    public String list(Model model){

        dao.mtList();
        model.addAttribute("mtList", dao.mtList());

        play dto = new play();
        dto.setPLAY_DT("2021-05-01");

        model.addAttribute("htList", dao.htList(dto));

        return "playList/list";
    }

    @GetMapping("/subList")
    @ResponseBody
    public List<play> subList(@ModelAttribute play mo){

        Map<String, Object> returnMap = new HashMap<>();

        List<play> data = dao.htList(mo);

        return data;
    }
}