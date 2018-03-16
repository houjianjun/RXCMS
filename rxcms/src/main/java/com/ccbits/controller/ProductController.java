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

import com.ccbits.entity.Product;
import com.ccbits.entity.Roles;
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
	 * 产品列表
	 * @return
	 */
	@GetMapping("/productList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/product/productList"); 
		List<Product> list=pi.getAll();
		mav.addObject("list", list);
		return mav;
	}
	@GetMapping("/addOrEdit")
	public ModelAndView addOrEdit(Integer id) {
		ModelAndView mav = new ModelAndView("admin/product/product");
		// 如果id不为空，根据id查询该对象进行编辑

		return mav;
	}

	/**
	 * 产品添加
	 * 
	 * @param roles
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/add")
	public void add(Product product, HttpServletResponse response) throws IOException {
		System.out.println(product.getName());
		if (null == product.getId() || product.getId() == 0) {
			if (pi.add(product)) {
				response.sendRedirect("productList");
			}
		}else {
			if(pi.update(product)) {
				response.sendRedirect("productList");
			}
		}
	}
	
	/**
	 * 删除角色
	 * @param roles
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/dels")
	public String dels(String dels) {
		System.out.println(dels);
		pi.removes(dels.split(","));
		return "redirect:productList";
	}
	
	/**
	 * 修改角色
	 * @param id
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/edit")
	public ModelAndView edit(Integer id,HttpServletResponse response) throws IOException {
		Product product=pi.get(id);
		ModelAndView mav=new ModelAndView("admin/product/product");
		if(product!=null) {
			mav.addObject("product", product);
		}
		return mav;
	}
	
}
