package com.ccbits.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ccbits.entity.Files;
import com.ccbits.service.FilesI;

/**
 * 
 * @日	  期: 2018年3月14日-下午2:55:32
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Controller
@RequestMapping("admin/files")
public class FilesController {
	@Resource
	private	FilesI fi;
	/**
	 * 用户列表
	 * @return
	 */
	@GetMapping("/filesList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/files/filesList"); 
		List<Files> list=fi.getAll();
		mav.addObject("list", list);
		return mav;
	}
}
