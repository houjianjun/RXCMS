package com.ccbits.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ccbits.entity.Product;
import com.ccbits.service.ProductI;

/**
 * 
 * @日	  期: 2018年3月14日-下午1:34:01
 * @作	  者：侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Controller
@RequestMapping("admin/product")
public class ProductController {
	@Resource
	private ProductI pi;
	/**
	 * 用户列表
	 * @return
	 */
	@GetMapping("/productList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/product/productList"); 
		List<Product> list=pi.getAll();
		mav.addObject("list", list);
		return mav;
	}
}
