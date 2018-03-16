package com.ccbits.service;

import java.util.List;

import com.ccbits.entity.News;
import com.ccbits.entity.NewsClass;

/**
 * 
 * @日	  期: 2018年3月14日-下午2:27:04
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
public interface NewsI {
	public List<News> getAll();

	public News get(Integer id);

	public boolean removes(String[] split);

	public boolean update(News news);

	public boolean add(News news);
}
