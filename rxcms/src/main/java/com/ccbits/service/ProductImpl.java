package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.entity.Product;
import com.ccbits.mapper.ProductMapper;
/**
 * 
 * @日	  期: 2018年3月14日-下午2:04:35
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：产品实现类
 */
@Service
public class ProductImpl implements ProductI {

	@Resource
	private ProductMapper pm;
	
	@Override
	public List<Product> getAll() {
		return pm.selectByAll();
	}

}
