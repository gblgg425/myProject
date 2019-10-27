package com.hqyj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqyj.entity.Role;
import com.hqyj.entity.User;
import com.hqyj.service.UserService;
import com.hqyj.util.MD5;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping("/updatePwd")
	public String getUser(HttpServletRequest request){
		String username = request.getParameter("username");
		String newpass = request.getParameter("newpass");
		//加密后的密码
		String pwd = MD5.getMD5(newpass,username).toString();
		User user = new User();
		user.setuName(username);
		user.setuPwd(pwd);

		us.updateUserPwd(user);
		
		return "updatepwdsucess";
		
	}
	//修改角色
	@RequestMapping("/updateRole")
	public String updateRole(HttpServletRequest request){
		
		int rid = Integer.parseInt(request.getParameter("uid"));
		String role = request.getParameter("role");
		Role roles = new Role();
		roles.setrId(rid);
		roles.setrName(role);
		us.updateRole(roles);
		//重定向路径到全查页面
		return "redirect:/syset/updateRole";
		
	}
	//删除角色
	@RequestMapping("/deleteRole")
	public String deleteRole(int rid){
		us.deleteRole(rid);
		return "redirect:/syset/updateRole";
	}
	//增加角色
	@RequestMapping("/addRole")
	public String addRole(HttpServletRequest request){
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		Role role = new Role();
		int rid = Integer.parseInt(request.getParameter("role"));
		role.setrId(rid);
		User user = new User();
		user.setuName(name);
		user.setuPwd(pwd);
		user.setRole(role);
		us.addRole(user);
		return "redirect:/syset/updateRole";
	}
	@RequestMapping("/addRoleJsp")
	public String addRoleJsp(){
		return "addRole";
	}

}
