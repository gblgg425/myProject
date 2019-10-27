package com.hqyj.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	//浏览器输入地址
		@RequestMapping("/gologin")
		public String gologin() {
			return "login";
		}
		//退出
		@RequestMapping("/logout")
		public String logout() {
			Subject subject = SecurityUtils.getSubject();
			subject.logout();
			//点击退出，返回到登录页面
			return "login";
		}
		//登录
		@RequestMapping("/login")
		public String login(String username,String password,HttpServletRequest request) {
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(username,password);
			try {
				subject.login(token);
				//重定向到main页面，把用户名传到main页面
				return "redirect:main?username="+username;
			} catch (AuthenticationException e) {
				e.printStackTrace();
				request.getSession().setAttribute("error","账号密码错误");
				//
				return "login";
			}
		}
}
