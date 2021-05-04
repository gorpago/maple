package com.maple.bella.contorller;

import com.maple.bella.dao.playDao;
import com.maple.bella.model.play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/play")
public class playController {

    @Autowired
    private playDao dao;


    @GetMapping("/list")
    public String list(Model model){

        dao.mtList();
        model.addAttribute("mtList", dao.mtList());

        return "play/list";
    }

    @PostMapping("/playerUpdqte")
    @ResponseBody
    public Map<String, Object> playerUpdqte(@ModelAttribute play mo, Model model){

        Map<String, Object> returnMap = new HashMap<>();

        play useList = dao.useList(mo);
        play banList = dao.banList(mo);

        List<play> mtList = dao.mtList();

        mo.setUSE_CNT(useList.getUSE_CNT());
        mo.setBAN_CNT(banList.getBAN_CNT());

        dao.htDelete(mo);
        dao.htInsert(mo);;

        dao.mtInsert(mo);

        returnMap.put("useList", useList);
        returnMap.put("banList", banList);
        returnMap.put("mtList", mtList);

        return returnMap;
    }
}