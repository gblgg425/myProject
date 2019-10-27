package com.hqyj.entity;

import java.util.List;

public class Menu {
	//权限
	
	private int mId;
	//菜单名
	private String mName;
	//菜单所对应的URL
	private String mLink;
	//菜单所对应的多个角色
	private List<Role> roles;
	
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmLink() {
		return mLink;
	}
	public void setmLink(String mLink) {
		this.mLink = mLink;
	}
	

}
