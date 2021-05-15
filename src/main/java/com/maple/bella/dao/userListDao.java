package com.maple.bella.dao;

import com.maple.bella.model.userList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userListDao {
    public List<userList> selectList();
    public void update(userList userModel);
    public void monUpdate();
    public void monInit();
    public void conUpdate();
}
