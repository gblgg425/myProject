package com.hqyj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqyj.entity.Classbj;
import com.hqyj.entity.Student;
import com.hqyj.service.ClassService;

@Controller
@RequestMapping("/user")
public class ClassController {

	@Autowired 
	private ClassService cs;
	// 查询所有班级信息
	@RequestMapping("/query/classInfo")
	public String queryClassAll(HttpServletRequest request){
		List<Classbj> cl = cs.queryClassAll();
		request.getSession().setAttribute("ClassAll", cl);
		return "queryClassAll";
		
	}
	// 根据班级编号查询班级信息
	@RequestMapping("/query/classInfoByid")
	public String queryClassById(HttpServletRequest request){
		int bid = Integer.parseInt(request.getParameter("id"));
		Classbj cl = cs.queryClassById(bid);
		request.getSession().setAttribute("ClassByid", cl);
		return "redirect:/user/query/classInfo";
		
	}
	// 修改班级信息
	@RequestMapping("/update/updateClass")
	public String updateClass(HttpServletRequest request){
		Classbj cb=new Classbj();
		int bid = Integer.parseInt(request.getParameter("bid"));
		String bname=request.getParameter("bname");
		int bnum=Integer.parseInt(request.getParameter("bnum"));
		int bbzr=Integer.parseInt(request.getParameter("bbzr"));
		cb.setBno(bid);
		cb.setBname(bname);
		cb.setBnum(bnum);
		cb.setBzr(bbzr);
		cs.updateClass(cb);
		return "redirect:/user/query/classInfo";
		
	}
	// 查询所有班级信息
	@RequestMapping("/query/classstudent")
	public String queryClassStudent(HttpServletRequest request){
		int sBid = Integer.parseInt(request.getParameter("cno"));
		System.out.println(sBid);
		List<Student> cls = cs.queryClassStudent(sBid);
		request.getSession().setAttribute("ClassAllStudent", cls);
		return "queryClassAllStudent";
		
	}
}