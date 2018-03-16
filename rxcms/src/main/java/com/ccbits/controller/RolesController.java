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

import com.ccbits.entity.Manager;
import com.ccbits.entity.Roles;
import com.ccbits.service.RolesI;

/**
 * 
 * @日 期: 2018年3月14日-下午3:44:10
 * @作 者： 侯建军
 * @公 司：智曼科技有限公司 @功能描述：
 */
@Controller
@RequestMapping("admin/roles")
public class RolesController {
	@Resource
	private RolesI ri;

	/**
	 * 用户列表
	 * 
	 * @return
	 */
	@GetMapping("/rolesList")
	public ModelAndView rolesList() {
		ModelAndView mav = new ModelAndView("admin/roles/rolesList");
		List<Roles> list = ri.getAll();
		mav.addObject("list", list);
		return mav;
	}

	@GetMapping("/addOrEdit")
	public ModelAndView addOrEdit(Integer id) {
		ModelAndView mav = new ModelAndView("admin/roles/roles");
		// 如果id不为空，根据id查询该对象进行编辑

		return mav;
	}

	/**
	 * 添加角色
	 * 
	 * @param roles
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/add")
	public void add(Roles roles, HttpServletResponse response) throws IOException {
		System.out.println(roles.getName());
		if (null == roles.getId() || roles.getId() == 0) {
			if (ri.add(roles)) {
				response.sendRedirect("rolesList");
			}
		}else {
			if(ri.update(roles)) {
				response.sendRedirect("rolesList");
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
		ri.removesRoles(dels.split(","));
		return "redirect:rolesList";
	}
	
	/**
	 * 修改角色
	 * @param id
	 * @param response
	 * @throws IOException
	 */
	@GetMapping("/edit")
	public ModelAndView edit(Integer id,HttpServletResponse response) throws IOException {
		Roles roles=ri.get(id);
		ModelAndView mav=new ModelAndView("admin/roles/roles");
		if(roles!=null) {
			mav.addObject("roles", roles);
		}
		return mav;
	}
}
