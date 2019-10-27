package com.hqyj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hqyj.entity.PageType;
import com.hqyj.entity.Teacher;
import com.hqyj.service.TeacherService;

import cn.itcast.utils.Page;

@Controller
@RequestMapping("/user")
public class TeacherController {
	@Autowired
	private TeacherService ts;

	// 查询所有老师信息
	@RequestMapping("/query/teacherAllInfo")
	public String queryTeacherAll(HttpServletRequest request) {
		List<Teacher> teaAll = ts.queryTeacherAll();
		// 实例化所需起始位置和每页条数的类
		PageType pageType = new PageType();
		// 从页面获取当前页面的页码
		String nowPage = request.getParameter("page");
		if (nowPage == null) {
			// 设置查询limit起始位置
			pageType.setStart(0);
		} else {
			// 根据当前页面算出limit结束位置
			pageType.setStart((Integer.parseInt(nowPage) - 1) * pageType.getSize());
		}
		// 查询出所需条数的数据
		List<Teacher> list = ts.queryTeacherAllLimit(pageType);
		// 获取查询总条数
		int num = teaAll.size();
		// System.out.println("查询总条数："+num);
		// 封装Page对象
		Page<Teacher> page = new Page<>();
		if (nowPage != null) {
			// 设置当前页码
			page.setPage(Integer.parseInt(nowPage));
		}
		// 设置展示列表
		page.setRows(teaAll);
		// 设置一页显示条数
		page.setSize(pageType.getSize());
		// 添加总条数
		page.setTotal(num);
		// 将page传到页面上
		request.setAttribute("page", page);
		request.getSession().setAttribute("teaAll", list);

		return "queryTeacherAll";
	}

	// 跳转查询老师个人信息页面
	@RequestMapping("/query/teacherInfo")
	public String queryTeacherByTno() {
		/*
		 * int tNo = Integer.parseInt(request.getParameter("tno")); Teacher tea
		 * = ts.queryTeacherByTno(tNo); request.getSession().setAttribute("t",
		 * tea);
		 */
		return "queryTeacherByTno";
	}

	// 通过个人账号查询老师信息
	@RequestMapping("/query/teacherInfo1")
	public String queryTeacherByTno1(HttpServletRequest request) {
		int tNo = Integer.parseInt(request.getParameter("tno"));
		Teacher tea = ts.queryTeacherByTno(tNo);
		request.getSession().setAttribute("t", tea);
		return "queryTeacherByTno";
	}

	// 通过个人账号查询老师信息
	@RequestMapping("/query/teacherInfo2")
	public String queryTeacherByTno2(HttpServletRequest request) {
		int tNo = Integer.parseInt(request.getParameter("tno"));
		Teacher tea = ts.queryTeacherByTno(tNo);
		request.setAttribute("teacher", tea);
		return "updateTeacher";
	}

	// 跳转查询老师个人考勤信息页面
	@RequestMapping("/query/teacherKaoqin")
	public String queryTeacherKaoQin(HttpServletRequest request) {
		return "queryTeacherKaoQin";
	}

	// do查询老师个人考勤信息
	@RequestMapping("/query/teacherKaoqin1")
	public String queryTeacherKaoQin1(HttpServletRequest request) {
		int tNo = Integer.parseInt(request.getParameter("tno"));
		Teacher teakq = ts.queryTeacherKaoQin(tNo);
		request.getSession().setAttribute("tkq", teakq);
		return "queryTeacherKaoQin";
	}

	// 查询所有老师考勤信息
	@RequestMapping("/query/teacherKaoqinAll")
	public String queryTeacherKaoqinAll(HttpServletRequest request) {
		List<Teacher> teakqall = ts.queryTeacherKaoQinAll();
		// 实例化所需起始位置和每页条数的类
		PageType pageType = new PageType();
		// 从页面获取当前页面的页码
		String nowPage = request.getParameter("page");
		if (nowPage == null) {
			// 设置查询limit起始位置
			pageType.setStart(0);
		} else {
			// 根据当前页面算出limit结束位置
			pageType.setStart((Integer.parseInt(nowPage) - 1) * pageType.getSize());
		}
		// 查询出所需条数的数据
		List<Teacher> list = ts.queryTeacherKaoQinAllLimit(pageType);
		// 获取查询总条数
		int num = teakqall.size();
		// System.out.println("查询总条数："+num);
		// 封装Page对象
		Page<Teacher> page = new Page<>();
		if (nowPage != null) {
			// 设置当前页码
			page.setPage(Integer.parseInt(nowPage));
		}
		// 设置展示列表
		page.setRows(teakqall);
		// 设置一页显示条数
		page.setSize(pageType.getSize());
		// 添加总条数
		page.setTotal(num);
		// 将page传到页面上
		request.setAttribute("page", page);
		request.getSession().setAttribute("list", list);
		return "queryTeacherKaoqinAll";
	}

	// 修改老师考勤
	@RequestMapping("/update/teacherKaoqinAll")
	public String updateTeacherKaoqinAll(HttpServletRequest request) {
		int tid= Integer.parseInt(request.getParameter("tid"));
		String tname = request.getParameter("tname");
		String kaoqin = request.getParameter("kaoqin");
		return "";
	}

	@RequestMapping("/update/tKaoQinAll")
	public String updateTeacherKaoqinAllJsp() {
		return "updateTeacherKaoQinAll";
	}

	// 增加老师考勤
	@RequestMapping("/add/teacherKaoqinAll")
	public String addTeacherKaoqinAll(HttpServletRequest request) {

		return "";
	}

	@RequestMapping("/add/tKaoQinAll")
	public String addTeacherKaoqinAllJsp() {
		return "addTeacherKaoQinAll";
	}
	//删除老师考勤
	@RequestMapping("/delete/tKaoQinAll")
	public String deleteTeacherKaoQin(HttpServletRequest req){
		int tid = Integer.parseInt(req.getParameter(""));
		ts.deleteTeacherKaoQinAll(tid);
		return "queryTeacherKaoqinAll";
	}

	// 删除老师信息
	@RequestMapping(value = "/delete/teacherInfo")
	public String deleteTeacherByTno(HttpServletRequest request) {
		int tNo = Integer.parseInt(request.getParameter("tNo"));
		System.out.println(tNo);
		ts.deleteTeacherByTno(tNo);
		
		return "redirect:/user/query/teacherAllInfo";

	}

	// 修改老师信息
	@RequestMapping(value = "/upadate/teacherInfo", method = RequestMethod.POST)
	public String updateTeacher(HttpServletRequest request) {
		Teacher teacher = new Teacher();
		int tNo = Integer.parseInt(request.getParameter("tno"));
		String tName = request.getParameter("tname");
		String tSex = request.getParameter("tsex");
		int tAge = Integer.parseInt(request.getParameter("tage"));
		String tPos = request.getParameter("tpos");

		teacher.settNo(tNo);
		teacher.settName(tName);
		teacher.settSex(tSex);
		teacher.settAge(tAge);
		teacher.settPos(tPos);
		System.out.println(teacher);
		ts.updateTeacher(teacher);
		return "redirect:/user/query/teacherAllInfo";
	}

	// 添加教师信息页面
	@RequestMapping("/query/addtTeacher")
	public String addTeacher() {
		/*
		 * int tNo = Integer.parseInt(request.getParameter("tno")); Teacher tea
		 * = ts.queryTeacherByTno(tNo); request.getSession().setAttribute("t",
		 * tea);
		 */
		return "addTeacher";
	}

	// 添加教师信息
	@RequestMapping(value = "/query/addtTeacher1", method = RequestMethod.POST)
	public String addTeacher1(HttpServletRequest request) {
		/*
		 * int tNo = Integer.parseInt(request.getParameter("tno")); Teacher tea
		 * = ts.queryTeacherByTno(tNo); request.getSession().setAttribute("t",
		 * tea);
		 */
		Teacher teacher = new Teacher();
		int tNo = Integer.parseInt(request.getParameter("tno"));
		String tName = request.getParameter("tname");
		String tSex = request.getParameter("tsex");
		int tAge = Integer.parseInt(request.getParameter("tage"));
		String tPos = request.getParameter("tpos");
		teacher.settNo(tNo);
		teacher.settName(tName);
		teacher.settSex(tSex);
		teacher.settAge(tAge);
		teacher.settPos(tPos);
		int result = ts.addTeacher(teacher);
		if (result > 0) {
			return "redirect:/user/query/teacherAllInfo";
		} else {
			return "addTeacher";
		}

	}
}
