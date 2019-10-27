package com.hqyj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.TeacherMapper;
import com.hqyj.entity.PageType;
import com.hqyj.entity.Teacher;
import com.hqyj.entity.TeacherKaoQin;
import com.hqyj.service.TeacherService;


@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper tm;

	// 查询所有老师信息
	@Override
	public List<Teacher> queryTeacherAll() {
		List<Teacher> teas = tm.queryTeacherAll();
		return teas;
	}
	@Override
	public List<Teacher> queryTeacherAllLimit(PageType page) {
		List<Teacher> list = tm.queryTeacherAllLimit(page);
		return list;
	}
	
	
	// 查询老师个人考勤
	@Override
	public Teacher queryTeacherKaoQin(int tNo) {
		Teacher kaoQin = tm.queryTeacherKaoQin(tNo);
		return kaoQin;
	}
	//查询所有老师考勤
	@Override
	public List<Teacher> queryTeacherKaoQinAll() {
/*//		调用startPage方法开始分页
		PageHelper.startPage(pageNum, pageSize);
//		从TeacherMapper接口中调用方法，得到查询结果
		List<Teacher> list = tm.queryTeacherKaoQinAll();
//		将查询出的结果集放到PageInfo里面
		PageInfo<Teacher> pageInfo = new PageInfo<>(list);
		return pageInfo;*/
		List<Teacher> list = tm.queryTeacherKaoQinAll();
		return list;
	}
	//修改老师考勤，通过id
	@Override
	public void updateTeacherKaoQinAll(int id) {
		tm.updateTeacherKaoQinAll(id);
		
	}
	//增加老师考勤
	@Override
	public void addTeacherKaoQinAll(TeacherKaoQin tk) {
		tm.addTeacherKaoQinAll(tk);
		
	}
	//删除老师考勤
	@Override
	public void deleteTeacherKaoQinAll(int tid) {
		tm.deleteTeacherKaoQinAll(tid);
		
	}
	
	@Override
	public List<Teacher> queryTeacherKaoQinAllLimit(PageType page) {
		List<Teacher> list = tm.queryTeacherKaoQinAllLimit(page);
		return list;
	}
	
	
	
	// 老师通过个人账号查询信息
	@Override
	public Teacher queryTeacherByTno(int tNo) {
		// TODO Auto-generated method stub
		Teacher tea = tm.queryTeacherByTno(tNo);
		return tea;
	}

	
	// 删除老师个人信息

	@Override
	public void deleteTeacherByTno(int tNo) {
		// TODO Auto-generated method stub
		tm.deleteTeacherByTno(tNo);

	}

	@Override
	public int addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		int result = tm.addTeacher(teacher);
		return result;
	}


	@Override
	public void updateTeacher(Teacher teacher) {
		tm.updateTeacher(teacher);

		// TODO Auto-generated method stub

	}
	

	
}
