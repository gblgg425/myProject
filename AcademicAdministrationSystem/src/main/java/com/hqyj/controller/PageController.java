package com.hqyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/main")
	public String index() {
		return "main";
	}
	@RequestMapping("/error")
	public String error() {
		return "error";
	}
}
