package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Role;
import com.hqyj.entity.User;

public interface UserService {
	
	public User findUserByUsername(String username);
	
	//查询所有用户对应的角色信息
	public List<User> findUserAll();
	
	//根据用户名更新密码
	public void updateUserPwd(User user);
	
	//修改用户角色
	public void updateRole(Role role);
	
	//删除用户角色
	public void deleteRole(int uid);
	
	//增加用户角色
	public void addRole(User user);
		
		
}
