package com.hqyj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.UserMapper;
import com.hqyj.entity.Role;
import com.hqyj.entity.User;
import com.hqyj.service.UserService;

@Service
//标注为业务层
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper um;
	@Override
	public User findUserByUsername(String username) {
		User user = um.findUserByUsername(username);
		return user;
	}
	
	//查询所有用户对应的角色信息
	@Override
	public List<User> findUserAll() {
		List<User> list = um.findUserAll();
		return list;
	}

	//根据用户名更新密码
	@Override
	public void updateUserPwd(User user) {
		um.updateUserPwd(user);
		
	}

	//修改用户角色
	@Override
	public void updateRole(Role role) {
		um.updateRole(role);
		
	}
	//删除用户角色
	@Override
	public void deleteRole(int uid) {
		um.deleteRole(uid);
		
	}

	@Override
	public void addRole(User user) {
		um.addRole(user);
		
	}


}
