package com.maple.bella.contorller;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userListDao {
    public List<userList> selectList();
    public void update(userList userModel);
    public void monUpdate();
    public void monInit();
}
