package com.ccbits.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ccbits.entity.News;
import com.ccbits.service.NewsI;

/**
 * 
 * @日	  期: 2018年3月14日-下午2:24:50
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：内容控制器
 */
@Controller
@RequestMapping("admin/news")
public class NewsController {
	@Resource
	private NewsI ni;
	/**
	 * 用户列表
	 * @return
	 */
	@GetMapping("/newsList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/news/newsList"); 
		List<News> list=ni.getAll();
		mav.addObject("list", list);
		return mav;
	}
}
