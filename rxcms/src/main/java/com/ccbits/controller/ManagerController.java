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

import com.ccbits.common.Md5Utils;
import com.ccbits.entity.Manager;
import com.ccbits.service.ManagerServiceI;

/**
 * 
 * @日	  期: 2018年3月9日-上午9:23:03
 * @作	  者：侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：管理员控制器
 */
@Controller
@RequestMapping("/admin")
public class ManagerController {
	@Resource
	private ManagerServiceI msi;
	
	@GetMapping("/login")
	public String login() {
		return "admin/login";
	}
	/**
	 * 用户登录
	 * @param name
	 * @param pwd
	 * @return
	 */
	@PostMapping("/chckLogin")
	public String checkLogin(String name,String pwd) {
		Manager manager=new Manager();
		manager.setName(name);
		manager.setPwd(Md5Utils.md5(pwd));
		System.out.println(name+":"+pwd);
		if(msi.Login(manager)) {
			return "admin/index";
		}
		return "admin/login";
	}
	/**
	 * 欢迎页面
	 * @return
	 */
	@GetMapping("/welcome")
	public String welcome() {
		return "admin/welcome";
	}
	/**
	 * 用户列表
	 * @return
	 */
	@GetMapping("/manager/managerList")
	public ModelAndView managerList() {
		ModelAndView mav = new ModelAndView("admin/manager/managerList"); 
		List<Manager> list=msi.getManagerAll();
		mav.addObject("list", list);
		return mav;
	}
	/**
	 * 显示添加或编辑用户列表
	 * @param id
	 * @return
	 */
	@GetMapping("/manager/addOrEdit")
	public ModelAndView addOrEdit(Integer id) {
	    ModelAndView mav = new ModelAndView("admin/manager/manager"); 
	    //如果id不为空，根据id查询该对象进行编辑
	    
		return mav;
	}
	
	/**
	 * 添加用户
	 * @param manager
	 * @return
	 * @throws IOException 
	 */
	@PostMapping("/manager/add")
	public void add(Manager manager,HttpServletResponse response) throws IOException {
		System.out.println(manager.getName());
		if(msi.addManager(manager)) {
			response.sendRedirect("managerList");
		}
	}
	/**
	 * 删除用户
	 * @param manager
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/manager/dels")
	public void dels(String dels,HttpServletResponse response) throws IOException {
		msi.removesManager(dels.split(","));
		response.sendRedirect("managerList");
	}
	/**
	 * 修改用户
	 * @param manager
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/manager/edit")
	public ModelAndView edit(Integer id,HttpServletResponse response) throws IOException {
		Manager manager=msi.getManager(id);
		ModelAndView mav=new ModelAndView("admin/manager/manager");
		if(manager!=null) {
			mav.addObject("manager", manager);
		}
		return mav;
	}
}
