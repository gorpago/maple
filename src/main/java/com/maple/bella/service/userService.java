package com.maple.bella.service;


import com.maple.bella.dao.userDao;
import com.maple.bella.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class userService {

    @Autowired
    private userDao dao;

    @Autowired
    private PasswordEncoder encoder;

    public void insert(user mo){

        mo.setPASSWORD(encoder.encode(mo.getPASSWORD()));

        dao.insertUser(mo);

        dao.insertRole(mo);
    }
}
