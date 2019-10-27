package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.PageType;
import com.hqyj.entity.Teacher;
import com.hqyj.entity.TeacherKaoQin;

@Repository
public interface TeacherMapper {
	// 查询所有老师信息
	public List<Teacher> queryTeacherAll();
	public List<Teacher> queryTeacherAllLimit(PageType page);

	// 查询老师个人考勤
	public Teacher queryTeacherKaoQin(int tNo);

	// 通过老师个人编号查询个人信息
	public Teacher queryTeacherByTno(int tNo);

	// 查询所有老师考勤
	public List<Teacher> queryTeacherKaoQinAll();
	public List<Teacher> queryTeacherKaoQinAllLimit(PageType page);
	
	//修改老师考勤，通过id
	public void updateTeacherKaoQinAll(int id);
	//增加老师考勤
	public void addTeacherKaoQinAll(TeacherKaoQin tk);
	//删除老师考勤
	public void deleteTeacherKaoQinAll(int tid);
	
	//通过编号删除老师信息

	// 通过编号删除老师信息
	public void deleteTeacherByTno(int tNo);

	// 添加老师信息
	public int addTeacher(Teacher teacher);

	// 修改老师信息
	public void updateTeacher(Teacher teacher);
}
