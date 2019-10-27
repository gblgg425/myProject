package com.hqyj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqyj.entity.User;
import com.hqyj.service.UserService;

@Controller
@RequestMapping("/syset")
public class SysetController {
	
	@Autowired
	private UserService us;
	
	//修改密码
	@RequestMapping("/updatePwd")
	public String updatePwd(String username){
		return "updatePwd";
		//return "redirect:updatePwd?username="+username;
	}
	//修改角色
	@RequestMapping("updateRole")
	public String updateRole(HttpServletRequest request){
		List<User> list = us.findUserAll();
		request.getSession().setAttribute("UserAll", list);
		return "updateRole";
	}
	//管理员信息
	@RequestMapping("adminInfo")
	public String adminInfo(){
		return "adminInfo";
	}
}
