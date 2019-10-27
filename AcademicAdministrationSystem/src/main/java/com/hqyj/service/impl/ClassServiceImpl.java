package com.hqyj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.ClassMapper;
import com.hqyj.entity.Classbj;
import com.hqyj.entity.Student;
import com.hqyj.service.ClassService;
@Service
public class ClassServiceImpl implements ClassService{
	
	@Autowired
	private ClassMapper cm;
	
	@Override//重写查询所有班级方法
	public List<Classbj> queryClassAll() {
		// TODO Auto-generated method stub
		List<Classbj> lc=cm.queryClassAll();
		return lc;
	}

	@Override//查询班级学生列表
	public List<Student> queryClassStudent(int cNo) {
		// TODO Auto-generated method stub
		List<Student> cs=cm.queryClassStudent(cNo);
		return cs;
	}

	@Override//重写id查询班级
	public Classbj queryClassById(int bid) {
		// TODO Auto-generated method stub
		Classbj cs=cm.queryClassById(bid);
		return cs;
	}

	@Override//班级修改
	public void updateClass(Classbj cb) {
		// TODO Auto-generated method stub
		cm.updateClass(cb);
	}

}
