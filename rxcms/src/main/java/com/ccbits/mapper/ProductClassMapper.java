package com.ccbits.mapper;

import java.util.List;

import com.ccbits.entity.ProductClass;
/**
 * 
 * @日	  期: 2018年3月14日-下午1:39:22
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：产品分类接口
 */
public interface ProductClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductClass record);

    ProductClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(ProductClass record);
    
    List<ProductClass> selectByAll();
}