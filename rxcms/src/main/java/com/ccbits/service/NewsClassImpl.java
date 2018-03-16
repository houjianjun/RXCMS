package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.entity.NewsClass;
import com.ccbits.entity.ProductClass;
import com.ccbits.mapper.NewsClassMapper;
/**
 * 
 * @日	  期: 2018年3月14日-下午2:35:07
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Service
public class NewsClassImpl implements NewsClassI {
	@Resource
	private NewsClassMapper ncm;
	@Override
	public List<NewsClass> getAll() {	
		return ncm.selectByAll();
	}
	@Override
	public boolean add(NewsClass newsClass) {
		if(ncm.insert(newsClass)>0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean update(NewsClass newsClass) {
		if(ncm.updateByPrimaryKey(newsClass)>0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean removes(String[] split) {
		if(ncm.deleteByKeys(split)>0) {
			return true;
		}
		return false;
		
	}
	@Override
	public NewsClass get(Integer id) {
		NewsClass newsClass=ncm.selectByPrimaryKey(id);
		return newsClass;
	}

}
