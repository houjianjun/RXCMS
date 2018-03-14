package com.ccbits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @日	  期: 2018年3月14日-上午9:43:06
 * @作	  者：侯建军
 * @公	  司：智曼科技有限公司
 * @功能描述：
 */
@Controller
public class IndexController {
	@GetMapping("/")
	public String Index() {
		
		return "web/index";
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/product")
	public String product() {
		
		return "web/product";
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/gallery")
	public String gallery() {
		
		return "web/gallery";
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/download")
	public String download() {
		
		return "web/download";
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/question")
	public String question() {
		
		return "web/question";
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/contact")
	public String contact() {
		return "web/contact";
	}
}
