package com.hqyj.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.hqyj.entity.Role;
import com.hqyj.entity.User;
import com.hqyj.service.UserService;

public class MyRealm extends AuthorizingRealm{
	
	@Autowired
	private UserService us;
	
	/**
	 * 授权时调用
	 * */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//1.从PrincipalCollection中来获取登录用户的信息
		Object principal = principals.getPrimaryPrincipal();
		System.out.println("当前登录的用户:"+principal);
		//2.利用登录的用户信息来获取当前的角色以及权限（可能查询数据库）
		Set<String> set = new HashSet<>();
		//查询user通过账号
		User user= us.findUserByUsername((String) principal);
		//得到对应的角色
		Role role = user.getRole();
		//角色名放入集合中
		set.add(role.getrName());
		
		System.out.println("set里的值："+set);
		//3.创建
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//给当前用户添加角色
		info.addRoles(set);
		return info;
	}

	/**
	 * 认证时调用（登录）
	 * */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//从token里面取出
		String username = (String) token.getPrincipal();
		//通过username去数据库里面查询
		User user = us.findUserByUsername(username);
		System.out.println(user);
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		session.setAttribute("username", user.getuName());
		// 获取盐，通常用账号
		ByteSource credentialsSalt = ByteSource.Util.bytes(username);
		// 盐值加密
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username,user.getuPwd(),credentialsSalt,getName());
		return info;
		
	}

}
