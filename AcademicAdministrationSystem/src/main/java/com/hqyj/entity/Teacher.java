package com.hqyj.entity;

public class Teacher {
	private int tId;
	private int tNo;
	private String tName;
	private String tSex;
	private int tAge;
	private String tPos;
	// 老师考勤信息
	private TeacherKaoQin kq;

	public TeacherKaoQin getKq() {
		return kq;
	}

	public void setKq(TeacherKaoQin kq) {
		this.kq = kq;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public int gettNo() {
		return tNo;
	}

	public void settNo(int tNo) {
		this.tNo = tNo;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettSex() {
		return tSex;
	}

	public void settSex(String tSex) {
		this.tSex = tSex;
	}

	public int gettAge() {
		return tAge;
	}

	public void settAge(int tAge) {
		this.tAge = tAge;
	}

	public String gettPos() {
		return tPos;
	}

	public void settPos(String tPos) {
		this.tPos = tPos;
	}

	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tNo=" + tNo + ", tName=" + tName + ", tSex=" + tSex + ", tAge=" + tAge
				+ ", tPos=" + tPos + ", kq=" + kq + "]";
	}

}
