package com.ccbits.service;

import java.util.List;

import com.ccbits.entity.NewsClass;

/**
 * 
 * @日	  期: 2018年3月14日-下午2:34:24
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
public interface NewsClassI {
	public List<NewsClass> getAll();

	public boolean add(NewsClass newsClass);

	public boolean update(NewsClass newsClass);

	public boolean removes(String[] split);

	public NewsClass get(Integer id);
}
