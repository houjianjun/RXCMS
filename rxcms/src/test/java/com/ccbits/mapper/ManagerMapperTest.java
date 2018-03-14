package com.ccbits.mapper;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import com.ccbits.common.Base;
import com.ccbits.common.Md5Utils;
import com.ccbits.entity.Manager;

public class ManagerMapperTest extends Base {

	@Resource
	private ManagerMapper managerMapper;
	
	@Test
	public void testInsert() {
		Manager manager=new Manager();
		manager.setName("lisi");
		manager.setPwd(Md5Utils.md5("123456"));
		managerMapper.insert(manager);
		System.out.println(managerMapper);
	}

	@Test
	public void testSelectByPrimaryKey() {
		Manager manager=managerMapper.selectByPrimaryKey(2);
		System.out.println(manager.getName());
	}
	@Test
	public void testSelectByKeys() {
		int size=managerMapper.deleteByKeys(new String[] {"7","8"});
		System.out.println(size);
	}
	@Test
	public void testSelectManager() {
		Manager manager=new Manager();
		manager.setName("zhangsan");
		manager.setPwd("123456");
		List<Manager> list=managerMapper.selectManager(manager);
		Assert.assertTrue(list.size()>0);
	}

}
