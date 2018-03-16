package com.ccbits.service;

import java.util.List;

import com.ccbits.entity.Sysconfig;

/**
 * 
 * @日	  期: 2018年3月14日-下午4:35:44
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
public interface SysconfigI {
	public List<Sysconfig> getAll();
	public boolean add(Sysconfig sysconfig);
	public boolean removesSysconfig(String[] split);
	public Sysconfig get(Integer id);
	public boolean update(Sysconfig sysconfig);
}
