package com.ccbits.mapper;

import java.util.List;

import com.ccbits.entity.Product;
/**
 * 
 * @日	  期: 2018年3月14日-下午2:06:37
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：产品 Mapper接口
 */
public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Product record);
    
    List<Product> selectByAll();

	int deleteByKeys(String[] keys);
}