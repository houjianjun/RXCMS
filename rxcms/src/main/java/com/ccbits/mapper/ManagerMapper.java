package com.ccbits.mapper;



import java.util.List;

import com.ccbits.entity.Manager;
/**
 * 
 * @日	  期: 2018年3月9日-下午4:28:54
 * @作	  者：neuedu
 * @公	  司：智曼科技有限公司
 * @功能描述：管理员Mapper接口
 */
public interface ManagerMapper {
	//根据主键删除
    int deleteByPrimaryKey(Integer aId);
    //批量删除
    int deleteByKeys(String[] keys);
    //插入记录
    int insert(Manager record);

    //根据主键查询
    Manager selectByPrimaryKey(Integer aId);

    //记录修改
    int updateByPrimaryKey(Manager record);
    
    //条件查询
    List<Manager> selectManager(Manager manager);
    
    //查询所有
    List<Manager> selectByAll();
}