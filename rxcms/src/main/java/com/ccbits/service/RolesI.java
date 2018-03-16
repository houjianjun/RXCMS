package com.ccbits.service;

import java.util.List;

import com.ccbits.entity.Manager;
import com.ccbits.entity.Roles;

/**
 * 
 * @日	  期: 2018年3月14日-下午3:42:13
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
public interface RolesI {
	public List<Roles> getAll();
	public boolean add(Roles roles);
	public boolean removesRoles(String[] keys);
	public Roles get(Integer id);
	//更新管理员
	public boolean update(Roles roles);
}
