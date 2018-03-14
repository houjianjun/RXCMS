package com.ccbits.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccbits.entity.Files;
import com.ccbits.mapper.FilesMapper;
/**
 * 
 * @日	  期: 2018年3月14日-下午2:58:38
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Service
public class FilesImpl implements FilesI {
	@Resource
	private FilesMapper filesMapper;
	@Override
	public List<Files> getAll() {
		// TODO Auto-generated method stub
		return filesMapper.selectByAll();
	}

}
