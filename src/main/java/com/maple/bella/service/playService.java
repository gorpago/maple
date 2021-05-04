package com.maple.bella.service;


import com.maple.bella.dao.playDao;
import com.maple.bella.model.play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class playService {

    @Autowired
    private playDao dao;

    @Autowired
    private PasswordEncoder encoder;

    public void playerUpdqte(play mo){



        dao.useList(mo);
        dao.banList(mo);

        dao.mtInsert(mo);

        dao.htDelete(mo);
        dao.htInsert(mo);;
    }
}
