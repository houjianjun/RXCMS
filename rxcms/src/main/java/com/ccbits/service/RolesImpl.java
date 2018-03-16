package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.entity.Manager;
import com.ccbits.entity.Roles;
import com.ccbits.mapper.RolesMapper;
/**
 * 
 * @日	  期: 2018年3月14日-下午3:43:01
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Service
public class RolesImpl implements RolesI {
	@Resource
	private RolesMapper rm;
	@Override
	public List<Roles> getAll() {
		return rm.selectByAll();
	}
	@Override
	public boolean add(Roles roles) {
		if(rm.insert(roles)>0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean removesRoles(String[] keys) {
		if(rm.deleteByKeys(keys)>0) {
			return true;
		}
		return false;
	}
	@Override
	public Roles get(Integer id) {
		Roles roles=rm.selectByPrimaryKey(id);
		return roles;
	}
	@Override
	public boolean update(Roles roles) {
		if(rm.updateByPrimaryKey(roles)>0) {
			return true;
		}
		return false;
	}

}
