package com.ccbits.mapper;

import java.util.List;

import com.ccbits.entity.Files;

public interface FilesMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Files record);

	Files selectByPrimaryKey(Integer id);

	int updateByPrimaryKey(Files record);

	// 查询所有
	List<Files> selectByAll();
}