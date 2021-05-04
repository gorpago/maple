package com.maple.bella.dao;

import com.maple.bella.model.play;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface playDao {
    public List<play> mtList();
    public List<play> htList(play mo);
    play useList(play mo);
    play banList(play mo);
    void mtInsert(play mo);
    void htDelete(play mo);
    void htInsert(play mo);
}
