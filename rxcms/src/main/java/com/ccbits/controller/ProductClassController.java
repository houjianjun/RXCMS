package com.ccbits.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ccbits.entity.ProductClass;
import com.ccbits.service.ProductClassI;

/**
 * 
 * @日	  期: 2018年3月14日-上午11:35:27
 * @作	  者：侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：产品分类
 */
@Controller
@RequestMapping("admin/productClass")
public class ProductClassController {
	@Resource
	private ProductClassI pci;
	/**
	 * 用户列表
	 * @return
	 */
	@GetMapping("/productClassList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/productClass/productClassList"); 
		List<ProductClass> list=pci.getAll();
		mav.addObject("list", list);
		return mav;
	}
}
