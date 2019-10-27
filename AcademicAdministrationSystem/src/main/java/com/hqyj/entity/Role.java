package com.hqyj.entity;

import java.util.List;

public class Role {
	//角色
	private int rId;
	private String rName;
	//角色所对应的权限
	private List<Menu> list;
	public List<Menu> getList() {
		return list;
	}
	public void setList(List<Menu> list) {
		this.list = list;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	@Override
	public String toString() {
		return rName;
	}
	
}
