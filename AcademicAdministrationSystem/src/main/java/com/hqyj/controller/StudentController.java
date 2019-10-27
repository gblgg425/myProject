package com.hqyj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hqyj.entity.ChengJi;
import com.hqyj.entity.Student;
import com.hqyj.entity.StudentKaoqin;
import com.hqyj.service.StudentService;

@Controller
@RequestMapping("/user")
public class StudentController {

	// 注入studentservice
	@Autowired
	private StudentService ss;

	// 查询学生成绩
	@RequestMapping("/query/studenScore")
	public String queryStudentScore() {
		return "stuScore";
	}

	// 通过学号查询学生个人成绩
	@RequestMapping("/query/studenScore1")
	public String queryStudentScore1(HttpServletRequest request) {
		int sNo = Integer.parseInt(request.getParameter("sno"));
		List<Student> ls = ss.queryStudentScore(sNo);
		request.getSession().setAttribute("scj", ls);
		return "stuScore";
	}

	// 查询学生个人选课
	@RequestMapping("/query/courseInfo")
	public String queryStudentCourseInfo() {
		return "stuCourseInfo";
	}

	// 通过学号查询学生个人选课
	@RequestMapping("/query/courseInfo1")
	public String queryStudentCourseInfo1(HttpServletRequest request) {
		int sNo = Integer.parseInt(request.getParameter("sno"));
		List<Student> sci = ss.queryStudentCourseInfo(sNo);
		request.getSession().setAttribute("sci", sci);
		return "stuCourseInfo";
	}

	// 查询学生个人考勤
	@RequestMapping("/query/studentKaoqin")
	public String queryStudentKaoqin() {
		return "stuKaoqin";
	}

	// 通过学号查询学生个人考勤
	@RequestMapping("/query/studentKaoqin1")
	public String queryStudentKaoqin1(HttpServletRequest request) {
		int sNo = Integer.parseInt(request.getParameter("sno"));
		List<Student> skq = ss.queryStudentKaoqin(sNo);
		request.getSession().setAttribute("skq", skq);
		return "stuKaoqin";
	}

	// 查询学生个人信息
	@RequestMapping("/query/studentInfo")
	public String queryStudentInfo() {
		return "stuInfo";
	}

	// 通过学号查询学生个人信息
	@RequestMapping("/query/studentInfo1")
	public String queryStudentInfo1(HttpServletRequest request) {
		int sNo = Integer.parseInt(request.getParameter("sno"));
		Student stu = ss.queryStudentInfo(sNo);
		request.getSession().setAttribute("info", stu);
		return "stuInfo";
	}

	// 通过学号查询学生个人信息(修改部分)
	@RequestMapping("/query/studentInfo2")
	public String queryStudentInfo2(HttpServletRequest request) {
		int sNo = Integer.parseInt(request.getParameter("sno"));
		Student stu = ss.queryStudentInfo(sNo);
		request.getSession().setAttribute("stuinfo", stu);
		return "updateStudentInfo";
	}

	// 查询所有学生成绩
	@RequestMapping("/query/studentScore")
	public String queryAllStudentScore(HttpServletRequest request) {
		List<Student> ass = ss.queryAllStudentScore();
		request.getSession().setAttribute("ascore", ass);
		return "studentScore";
	}

	// 查询所有学生信息
	@RequestMapping("query/studentInfoAll")
	public String queryAllStudentInfo(HttpServletRequest request) {
		List<Student> asi = ss.queryAllStudentInfo();
		request.getSession().setAttribute("asi", asi);
		return "studentInfo";
	}

	// 查询所有学生选课信息
	@RequestMapping("query/studentCourse")
	public String queryAllStudentCourse(HttpServletRequest request) {
		List<Student> asc = ss.queryAllStudentCourse();
		request.getSession().setAttribute("asc", asc);
		return "studentCourse";
	}

	// 查询所有学生考勤信息
	@RequestMapping("query/studentKaoqinAll")
	public String queryAllStudentKaoqin(HttpServletRequest request) {
		List<Student> ask = ss.queryAllStudentKaoqin();
		request.getSession().setAttribute("ask", ask);
		return "studentKaoqinAll";
	}

	// 增加学生信息界面
	@RequestMapping("/add/studentInfo")
	public String addStudent() {
		return "addStudentInfo";
	}

	// 添加学生信息
	@RequestMapping(value = "/add/addStudent1", method = RequestMethod.POST)
	public String addStudnet1(HttpServletRequest request) {
		Student student = new Student();
		int sNo = Integer.parseInt(request.getParameter("sno"));
		String sName = request.getParameter("sname");
		String sSex = request.getParameter("ssex");
		int sAge = Integer.parseInt(request.getParameter("sage"));
		String sAddress = request.getParameter("saddress");
		String sBid = request.getParameter("sbid");

		student.setsNo(sNo);
		student.setsName(sName);
		student.setsSex(sSex);
		student.setsAge(sAge);
		student.setsAddress(sAddress);
		student.setsBid(sBid);
		int result = ss.addStudentInfo(student);
		if (result > 0) {
			return "redirect:/user/query/studentInfoAll";
		} else {
			return "addStudentInfo";
		}
	}

	// 删除学生信息
	@RequestMapping(value = "/delete/studentInfo", method = RequestMethod.POST)
	public String deleteTeacherByTno(int sNo) {
		ss.deleteStudentBySno(sNo);
		return "success";
	}

	// 增加学生成绩界面
	@RequestMapping("/add/studentScore")
	public String addStudentScore() {
		return "addStudentScore";
	}

	// 添加学生成绩
	@RequestMapping(value = "/add/addStudentScore1", method = RequestMethod.POST)
	public String addStudnetScore1(HttpServletRequest request) {
		ChengJi cj = new ChengJi();
		int cjsId = Integer.parseInt(request.getParameter("fk_cjsid"));
		int cjcId = Integer.parseInt(request.getParameter("fk_cjcid"));
		int score = Integer.parseInt(request.getParameter("score"));

		cj.setCjsId(cjsId);
		cj.setCjcId(cjcId);
		cj.setScore(score);

		int result = ss.addStudentScore(cj);
		if (result > 0) {
			return "redirect:/user/query/studentScore";
		} else {
			return "addStudentScore";
		}
	}

	// 修改学生信息
	@RequestMapping(value = "/update/studentInfo", method = RequestMethod.POST)
	public String updateStudent(HttpServletRequest request) {
		Student student = new Student();
		int sNo = Integer.parseInt(request.getParameter("sno"));
		String sName = request.getParameter("sname");
		String sSex = request.getParameter("ssex");
		int sAge = Integer.parseInt(request.getParameter("sage"));
		String sAddress = request.getParameter("saddress");
		// String sBid = request.getParameter("sbid");

		student.setsNo(sNo);
		student.setsName(sName);
		student.setsSex(sSex);
		student.setsAge(sAge);
		student.setsAddress(sAddress);
		// student.setsBid(sBid);
		System.out.println(student);
		ss.updateStudent(student);
		return "redirect:/user/query/studentInfoAll";
	}

	// 增加学生考勤信息界面
	@RequestMapping("/add/studentKaoqinInfo")
	public String addStudentKaoqinInfo() {
		return "addStudentKaoqinInfo";
	}

	// 添加学生考勤信息
	@RequestMapping(value = "/add/studentKaoqinInfo1", method = RequestMethod.POST)
	public String addStudentKaoqinInfo(HttpServletRequest request) {
		StudentKaoqin skq = new StudentKaoqin();
		int skId = Integer.parseInt(request.getParameter("skId"));
		String sContion = request.getParameter("scontion");

		skq.setFk_skId(skId);
		skq.setsContion(sContion);
		int result = ss.addStudentKaoqinInfo(skq);
		if (result > 0) {
			return "redirect:/user/query/studentKaoqinAll";
		} else {
			return "addStudentKaoqinInfo";
		}
	}

}
