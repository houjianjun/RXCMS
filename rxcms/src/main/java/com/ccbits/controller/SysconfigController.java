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

import com.ccbits.entity.Roles;
import com.ccbits.entity.Sysconfig;
import com.ccbits.service.SysconfigI;

/**
 * 
 * @日	  期: 2018年3月14日-下午4:33:24
 * @作	  者： 侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Controller
@RequestMapping("admin/sysconfig")
public class SysconfigController {
	@Resource
	private SysconfigI si;

	/**
	 * 用户列表
	 * 
	 * @return
	 */
	@GetMapping("/sysconfigList")
	public ModelAndView rolesList() {
		ModelAndView mav = new ModelAndView("admin/sysconfig/sysconfigList");
		List<Sysconfig> list = si.getAll();
		mav.addObject("list", list);
		return mav;
	}

	@GetMapping("/addOrEdit")
	public ModelAndView addOrEdit(Integer id) {
		ModelAndView mav = new ModelAndView("admin/sysconfig/sysconfig");
		return mav;
	}

	/**
	 * 添加用户
	 * 
	 * @param manager
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/add")
	public void add(Sysconfig sysconfig, HttpServletResponse response) throws IOException {
		System.out.println(sysconfig.getTitle());
		if (null == sysconfig.getId() || sysconfig.getId() == 0) {
			if (si.add(sysconfig)) {
				response.sendRedirect("sysconfigList");
			}
		}else {
			System.out.println(sysconfig.getId());
			if (si.update(sysconfig)) {
				response.sendRedirect("sysconfigList");
			}
		}
	}
	/**
	 * 修改配置
	 * @param sysconfig
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/edit")
	public ModelAndView edit(Integer id,HttpServletResponse response) throws IOException {
		Sysconfig sysconfig=si.get(id);
		ModelAndView mav=new ModelAndView("admin/sysconfig/sysconfig");
		if(sysconfig!=null) {
			mav.addObject("sysconfig", sysconfig);
		}
		return mav;
	}
	/**
	 * 删除配置
	 * @param roles
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/dels")
	public String dels(String dels) {
		si.removesSysconfig(dels.split(","));
		return "redirect:sysconfigList";
	}
}
