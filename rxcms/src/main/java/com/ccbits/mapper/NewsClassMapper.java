package com.ccbits.mapper;

import java.util.List;

import com.ccbits.entity.NewsClass;

public interface NewsClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsClass record);


    NewsClass selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(NewsClass record);
    
    List<NewsClass> selectByAll();
}