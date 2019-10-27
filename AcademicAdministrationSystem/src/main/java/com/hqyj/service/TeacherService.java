package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.PageType;
import com.hqyj.entity.Teacher;
import com.hqyj.entity.TeacherKaoQin;

public interface TeacherService {

	//查询所有老师信息
	public List<Teacher> queryTeacherAll();
	public List<Teacher> queryTeacherAllLimit(PageType page);
	
	//通过个人账号查询个人老师信息
	public Teacher queryTeacherByTno(int tNo);
	
	//查询老师个人考勤
	public Teacher queryTeacherKaoQin(int tNo);
	
	//查询所有老师考勤
	public List<Teacher> queryTeacherKaoQinAll();
	public List<Teacher> queryTeacherKaoQinAllLimit(PageType page);
	
	//修改老师考勤，通过id
	public void updateTeacherKaoQinAll(int id);
	//增加老师考勤
	public void addTeacherKaoQinAll(TeacherKaoQin tk);
	
	public void deleteTeacherKaoQinAll(int tid);
	
	//根据老师编号删除信息
	public void  deleteTeacherByTno(int tNo);
	
	//添加老师信息
	public int addTeacher(Teacher teacher);
		
	//修改老师信息
	public void updateTeacher(Teacher teacher);
}
