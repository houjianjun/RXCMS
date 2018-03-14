package com.ccbits.mapper;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;

import com.ccbits.common.Base;
import com.ccbits.entity.NewsClass;

public class NewsClassMapperTest extends Base{
	@Resource
	private NewsClassMapper ncm;
	
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		NewsClass nc=new NewsClass();
		nc.setName("公司简介");
		ncm.insert(nc);
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByAll() {
		fail("Not yet implemented");
	}

}
