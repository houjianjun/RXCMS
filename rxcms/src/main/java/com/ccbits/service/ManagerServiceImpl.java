package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.common.Md5Utils;
import com.ccbits.entity.Manager;
import com.ccbits.mapper.ManagerMapper;
/**
 * 
 * @日	  期: 2018年3月8日-下午3:43:09
 * @作	  者：neuedu
 * @公	  司：智曼科技有限公司
 * @功能描述：管理员业务实现类
 */
@Service
public class ManagerServiceImpl implements ManagerServiceI {
	@Resource
	private ManagerMapper managerMapper;
	
	@Override
	public boolean addManager(Manager manager) {
		manager.setPwd(Md5Utils.md5(manager.getPwd()));
		if(managerMapper.insert(manager)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean Login(Manager manager) {
		if(managerMapper.selectManager(manager).size()>0) {
			return true;
		}
		return false;
	}

	@Override
	public Manager getManager(Integer id) {
		Manager manager=managerMapper.selectByPrimaryKey(id);
		return manager;
	}

	@Override
	public void removeManager(Integer id) {
		managerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public boolean updateManager(Manager manager) {
		if(managerMapper.updateByPrimaryKey(manager)>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Manager> getManagerAll() {
		List<Manager> list=managerMapper.selectByAll();
		return list;
	}

	@Override
	public boolean removesManager(String[] keys) {
		if(managerMapper.deleteByKeys(keys)>0) {
			return true;
		}
		return false;
	}
}
