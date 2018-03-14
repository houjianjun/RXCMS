package com.ccbits.service;

import java.util.List;

import com.ccbits.entity.Manager;

/**
 * 
 * @日	  期: 2018年3月8日-下午3:40:38
 * @作	  者：neuedu
 * @公	  司：智曼科技有限公司
 * @功能描述：管理员接口
 */
public interface ManagerServiceI {
	//添加管理员
	public boolean addManager(Manager manager);
	//管理员登录
	public boolean Login(Manager manager);
	//查询管理员
	public Manager getManager(Integer id);
	//删除管理员
	public void removeManager(Integer id);
	//批量删除管理员
	public boolean removesManager(String[] keys);
	//更新管理员
	public boolean updateManager(Manager manager);
	//查询所有
	public List<Manager> getManagerAll();
}
