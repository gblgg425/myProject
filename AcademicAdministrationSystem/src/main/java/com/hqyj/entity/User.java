package com.hqyj.entity;

public class User {
	
	private int uId;
	private String uName;
	private String uPwd;
	private Role role;
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPwd=" + uPwd + ", role=" + role + "]";
	}
	
}
