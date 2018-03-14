package com.ccbits.mapper;

import java.util.List;

import com.ccbits.entity.News;
import com.ccbits.entity.Product;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    News selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(News record);
    
    List<News> selectByAll();
}