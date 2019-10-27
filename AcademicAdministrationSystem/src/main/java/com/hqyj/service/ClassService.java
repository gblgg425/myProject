package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Classbj;
import com.hqyj.entity.Student;

public interface ClassService {
	// 查询所有班级信息
	public List<Classbj> queryClassAll();
	//查询班级学生列表
	public List<Student> queryClassStudent(int cNo);
	public Classbj queryClassById(int bid);
	public void updateClass(Classbj cb);
	
}
