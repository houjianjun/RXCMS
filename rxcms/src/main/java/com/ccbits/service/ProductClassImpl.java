package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.entity.ProductClass;
import com.ccbits.mapper.ProductClassMapper;
/**
 * 
 * @日	  期: 2018年3月14日-下午1:54:50
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：产品分类实现类
 */
@Service
public class ProductClassImpl implements ProductClassI {
	@Resource
	private ProductClassMapper pm;

	@Override
	public List<ProductClass> getAll() {
		return pm.selectByAll();
	}

}
