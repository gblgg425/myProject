package com.hqyj.entity;

public class Course {
	// 课程id
	private int cId;
	// 课程编号
	private int cNo;
	// 课程名字
	private String cName;
	// 成绩对象
	private ChengJi cj;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public ChengJi getCj() {
		return cj;
	}

	public void setCj(ChengJi cj) {
		this.cj = cj;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cNo=" + cNo + ", cName=" + cName + ", cj=" + cj + "]";
	}

}
