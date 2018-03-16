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

import com.ccbits.entity.ProductClass;
import com.ccbits.entity.Roles;
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
	 * 分类列表
	 * @return
	 */
	@GetMapping("/productClassList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/productClass/productClassList"); 
		List<ProductClass> list=pci.getAll();
		mav.addObject("list", list);
		return mav;
	}
	@GetMapping("/addOrEdit")
	public ModelAndView addOrEdit(Integer id) {
		ModelAndView mav = new ModelAndView("admin/productClass/productClass");
		// 如果id不为空，根据id查询该对象进行编辑

		return mav;
	}

	/**
	 * 添加产品分类
	 * 
	 * @param productClass
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/add")
	public void add(ProductClass productClass, HttpServletResponse response) throws IOException {
		System.out.println(productClass.getName());
		if (null == productClass.getId() || productClass.getId() == 0) {
			if (pci.add(productClass)) {
				response.sendRedirect("productClassList");
			}
		}else {
			if(pci.update(productClass)) {
				response.sendRedirect("productClassList");
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
		pci.removes(dels.split(","));
		return "redirect:productClassList";
	}
	
	/**
	 * 修改角色
	 * @param manager
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/edit")
	public ModelAndView edit(Integer id,HttpServletResponse response) throws IOException {
		ProductClass productClass=pci.get(id);
		ModelAndView mav=new ModelAndView("admin/productClass/productClass");
		if(productClass!=null) {
			mav.addObject("productClass", productClass);
		}
		return mav;
	}
	
}
