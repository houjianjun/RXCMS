package com.ccbits.mapper;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;

import com.ccbits.common.Base;
import com.ccbits.entity.Sysconfig;

public class SysconfigMapperTest extends Base{
	@Resource
	private SysconfigMapper sm;
	
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		Sysconfig sys=new Sysconfig();
		sys.setTitle("test");
		sm.insert(sys);
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeyWithBLOBs() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
