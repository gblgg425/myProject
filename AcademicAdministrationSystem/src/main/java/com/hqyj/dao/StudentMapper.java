package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.ChengJi;
import com.hqyj.entity.Student;
import com.hqyj.entity.StudentKaoqin;

@Repository
public interface StudentMapper {
	// 查询学生个人成绩
	public List<Student> queryStudentScore(int sNo);

	// 查询学生个人选课
	public List<Student> queryStudentCourseInfo(int sNo);

	// 查询学生个人考勤
	public List<Student> queryStudentKaoqin(int sNo);

	// 查询学生个人信息
	public Student queryStudentInfo(int sNo);

	// 查询所有学生成绩
	public List<Student> queryAllStudentScore();

	// 添加学生成绩
	public int addStudentScore(ChengJi cj);

	// 查询所有学生信息
	public List<Student> queryAllStudentInfo();

	// 添加学生信息
	public int addStudentInfo(Student student);

	// 通过编号删除学生信息
	public void deleteStudentBySno(int sNo);

	// 查询所有学生选课信息
	public List<Student> queryAllStudentCourse();

	// 查询所有学生考勤
	public List<Student> queryAllStudentKaoqin();

	// 修改学生信息
	public void updateStudent(Student student);

	// 添加学生考勤信息
	public int addStudentKaoqinInfo(StudentKaoqin skq);
}
