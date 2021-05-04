package com.maple.bella.dao;

import com.maple.bella.model.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    public void insertUser(user userModel);
    public void insertRole(user userModel);
}
