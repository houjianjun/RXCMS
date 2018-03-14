package com.ccbits.mapper;

import java.util.List;

import com.ccbits.entity.Product;
import com.ccbits.entity.Roles;

public interface RolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    Roles selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Roles record);
    
    List<Roles> selectByAll();
}