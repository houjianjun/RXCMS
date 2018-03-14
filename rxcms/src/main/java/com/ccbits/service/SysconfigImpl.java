package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.entity.Sysconfig;
import com.ccbits.mapper.SysconfigMapper;
/**
 * 
 * @日	  期: 2018年3月14日-下午4:36:31
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Service
public class SysconfigImpl implements SysconfigI {
	@Resource
	private SysconfigMapper sm;
	@Override
	public List<Sysconfig> getAll() {
		
		return sm.selectByAll();
	}

	@Override
	public boolean add(Sysconfig sysconfig) {
		if(sm.insert(sysconfig)>0) {
			return true;
		}
		return false;
	}

}
