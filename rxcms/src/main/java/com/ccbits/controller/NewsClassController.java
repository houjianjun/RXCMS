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

import com.ccbits.entity.NewsClass;
import com.ccbits.entity.Product;
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
	 * 内容分类列表
	 * @return
	 */
	@GetMapping("/newsClassList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/newsClass/newsClassList"); 
		List<NewsClass> list=nci.getAll();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/addOrEdit")
	public ModelAndView addOrEdit(Integer id) {
		ModelAndView mav = new ModelAndView("admin/newsClass/newsClass");
		// 如果id不为空，根据id查询该对象进行编辑

		return mav;
	}

	/**
	 * 添加内容分类
	 * 
	 * @param newsClass
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/add")
	public void add(NewsClass newsClass, HttpServletResponse response) throws IOException {
		if (null == newsClass.getId() || newsClass.getId() == 0) {
			if (nci.add(newsClass)) {
				response.sendRedirect("newsClassList");
			}
		}else {
			if(nci.update(newsClass)) {
				response.sendRedirect("newsClassList");
			}
		}
	}
	
	/**
	 * 删除内容分类
	 * @param newsClass
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/dels")
	public String dels(String dels) {
		nci.removes(dels.split(","));
		return "redirect:newsClassList";
	}
	
	/**
	 * 修改内容分类
	 * @param id
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/edit")
	public ModelAndView edit(Integer id,HttpServletResponse response) throws IOException {
		NewsClass newsClass=nci.get(id);
		ModelAndView mav=new ModelAndView("admin/newsClass/newsClass");
		if(newsClass!=null) {
			mav.addObject("newsClass", newsClass);
		}
		return mav;
	}	
}
