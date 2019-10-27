package com.hqyj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.StudentMapper;
import com.hqyj.entity.ChengJi;
import com.hqyj.entity.Student;
import com.hqyj.entity.StudentKaoqin;
import com.hqyj.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper sm;

	// 查询学生个人成绩
	@Override
	public List<Student> queryStudentScore(int sNo) {
		List<Student> lcj = sm.queryStudentScore(sNo);
		return lcj;
	}

	// 查询学生个人选课
	@Override
	public List<Student> queryStudentCourseInfo(int sNo) {
		List<Student> lc = sm.queryStudentCourseInfo(sNo);
		return lc;
	}

	// 查询学生个人考勤
	@Override
	public List<Student> queryStudentKaoqin(int sNo) {
		List<Student> lsk = sm.queryStudentKaoqin(sNo);
		return lsk;
	}

	// 查询学生个人信息
	@Override
	public Student queryStudentInfo(int sNo) {
		Student stu = sm.queryStudentInfo(sNo);
		return stu;
	}

	// 查询所有学生成绩
	@Override
	public List<Student> queryAllStudentScore() {
		List<Student> lass = sm.queryAllStudentScore();
		return lass;
	}

	// 查询所有学生信息
	@Override
	public List<Student> queryAllStudentInfo() {
		List<Student> lasi = sm.queryAllStudentInfo();
		return lasi;
	}

	// 查询所有学生选课
	@Override
	public List<Student> queryAllStudentCourse() {
		List<Student> lasc = sm.queryAllStudentCourse();
		return lasc;
	}

	// 查询所有学生考勤
	@Override
	public List<Student> queryAllStudentKaoqin() {
		List<Student> lask = sm.queryAllStudentKaoqin();
		return lask;
	}

	// 添加学生信息
	@Override
	public int addStudentInfo(Student student) {
		int result = sm.addStudentInfo(student);
		return result;
	}

	// 通过学生学号删除学生信息
	@Override
	public void deleteStudentBySno(int sNo) {
		// TODO Auto-generated method stub
		sm.deleteStudentBySno(sNo);
	}

	// 添加学生成绩
	@Override
	public int addStudentScore(ChengJi cj) {
		int result = sm.addStudentScore(cj);
		return result;
	}

	@Override
	public Student queryStudentScore1(int sNo) {
		// TODO Auto-generated method stub
		return null;
	}

	// 修改学生信息
	@Override
	public void updateStudent(Student student) {
		sm.updateStudent(student);
	}

	// 增加学生考勤信息
	@Override
	public int addStudentKaoqinInfo(StudentKaoqin skq) {
		int result = sm.addStudentKaoqinInfo(skq);
		return result;
	}

}
