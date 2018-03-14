package com.ccbits.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ccbits.entity.NewsClass;
import com.ccbits.service.NewsClassI;

/**
 * 
 * @日	  期: 2018年3月14日-下午2:32:58
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Controller
@RequestMapping("admin/newsClass")
public class NewsClassController {
	@Resource
	private NewsClassI nci;
	/**
	 * 用户列表
	 * @return
	 */
	@GetMapping("/newsClasstList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/newsClass/newsClassList"); 
		List<NewsClass> list=nci.getAll();
		mav.addObject("list", list);
		return mav;
	}
}
