package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.ChengJi;
import com.hqyj.entity.Student;
import com.hqyj.entity.StudentKaoqin;

public interface StudentService {
	// 查询学生成绩
	public List<Student> queryStudentScore(int sNo);

	// 查询学生成绩
	public Student queryStudentScore1(int sNo);

	// 查询学生选课
	public List<Student> queryStudentCourseInfo(int sNo);

	// 查询学生考勤
	public List<Student> queryStudentKaoqin(int sNo);

	// 查询学生信息
	public Student queryStudentInfo(int sNo);

	// 查询所有学生成绩
	public List<Student> queryAllStudentScore();

	// 添加学生成绩
	public int addStudentScore(ChengJi cj);

	// 查询所有学生信息
	public List<Student> queryAllStudentInfo();

	// 添加学生信息
	public int addStudentInfo(Student student);

	// 查询所有学生选课信息
	public List<Student> queryAllStudentCourse();

	// 查询所有学生考勤
	public List<Student> queryAllStudentKaoqin();

	// 根据学生编号删除信息
	public void deleteStudentBySno(int sNo);

	// 修改学生信息
	public void updateStudent(Student student);

	// 添加学生信息
	public int addStudentKaoqinInfo(StudentKaoqin skq);

}
