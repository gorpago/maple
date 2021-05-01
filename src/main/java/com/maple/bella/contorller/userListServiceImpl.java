package com.maple.bella.contorller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class userListServiceImpl implements userListService {

    @Autowired
    userListDao dao;

    @Override
    public List<userList> selectList() {
        return dao.selectList();
    }
}
