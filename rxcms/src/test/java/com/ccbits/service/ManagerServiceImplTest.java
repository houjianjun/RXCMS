package com.ccbits.service;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ccbits.common.Base;
import com.ccbits.common.Md5Utils;
import com.ccbits.entity.Manager;



public class ManagerServiceImplTest extends Base {

	@Autowired
	private ManagerServiceI msi;
	
	@Test
	public void testLogin() {
		Manager manager=new Manager();
		manager.setName("zhangsan");
		manager.setPwd("123456");
		boolean bool=msi.Login(manager);
		Assert.assertTrue(bool);
	}

	@Test
	public void testaddManager() {
		Manager manager=new Manager();
		manager.setName("lisi");
		manager.setPwd("123456");
		boolean a=	msi.addManager(manager);
		System.out.println(a);
	}
}
