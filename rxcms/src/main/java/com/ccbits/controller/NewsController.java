package com.ccbits.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ccbits.entity.News;
import com.ccbits.entity.NewsClass;
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
	 * 内容列表
	 * @return
	 */
	@GetMapping("/newsList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/news/newsList"); 
		List<News> list=ni.getAll();
		mav.addObject("list", list);
		return mav;
	}
	@GetMapping("/addOrEdit")
	public ModelAndView addOrEdit(Integer id) {
		ModelAndView mav = new ModelAndView("admin/news/news");
		// 如果id不为空，根据id查询该对象进行编辑

		return mav;
	}

	/**
	 * 添加内容
	 * 
	 * @param newsClass
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/add")
	public void add(News news, HttpServletResponse response) throws IOException {
		if (null == news.getId() || news.getId() == 0) {
			if (ni.add(news)) {
				response.sendRedirect("newsList");
			}
		}else {
			if(ni.update(news)) {
				response.sendRedirect("newsList");
			}
		}
	}
	
	/**
	 * 删除内容
	 * @param news
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/dels")
	public String dels(String dels) {
		ni.removes(dels.split(","));
		return "redirect:newsList";
	}
	
	/**
	 * 修改内容
	 * @param id
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/edit")
	public ModelAndView edit(Integer id,HttpServletResponse response) throws IOException {
		News news=ni.get(id);
		ModelAndView mav=new ModelAndView("admin/news/news");
		if(news!=null) {
			mav.addObject("news", news);
		}
		return mav;
	}	
	
}
