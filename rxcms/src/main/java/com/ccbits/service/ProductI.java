package com.ccbits.service;

import java.util.List;

import com.ccbits.entity.Product;

/**
 * 
 * @日	  期: 2018年3月14日-下午2:03:06
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：产品业务接口
 */
public interface ProductI {
	public List<Product> getAll();

	public Product get(Integer id);

	public boolean removes(String[] split);

	public boolean update(Product product);

	public boolean add(Product product);
	
}
