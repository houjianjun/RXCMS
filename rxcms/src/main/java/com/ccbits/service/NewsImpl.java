package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.entity.News;
import com.ccbits.mapper.NewsMapper;
/**
 * 
 * @日	  期: 2018年3月14日-下午2:28:16
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Service
public class NewsImpl implements NewsI {

	@Resource
	private NewsMapper nm;
	
	@Override
	public List<News> getAll() {
		// TODO Auto-generated method stub
		return nm.selectByAll();
	}

}
