package com.ccbits.mapper;

import java.util.List;

import com.ccbits.entity.Sysconfig;
/**
 * 
 * @日	  期: 2018年3月14日-下午4:32:22
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
public interface SysconfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysconfig record);

    Sysconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Sysconfig record);
    
    List<Sysconfig> selectByAll();
    
	int deleteByKeys(String[] split);
}