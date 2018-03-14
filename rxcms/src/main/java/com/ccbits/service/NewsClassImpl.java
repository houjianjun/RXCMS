package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.entity.NewsClass;
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

}
