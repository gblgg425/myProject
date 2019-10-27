package com.hqyj.dao;

import java.util.List;

import com.hqyj.entity.Classbj;
import com.hqyj.entity.Student;

public interface ClassMapper {
	//查询班级列表（接口中）
	public List<Classbj> queryClassAll();
	//查询班级所有学生interface
	public List<Student> queryClassStudent(int cNo);
	//id查询班级
	public Classbj queryClassById(int bid);
	//班级修改
	public void updateClass(Classbj cb);
}
