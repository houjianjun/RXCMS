package com.ccbits.mapper;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;

import com.ccbits.common.Base;
import com.ccbits.entity.News;

public class NewsMapperTest extends Base{
	@Resource
	private NewsMapper nm;

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		News news=new News();
		news.setTitle("不错的选择");
		nm.insert(news);
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
