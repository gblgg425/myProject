package com.hqyj.entity;

import java.util.List;

public class Student {

	// 学生id
	private Integer sId;
	// 学生学号
	private Integer sNo;
	// 学生姓名
	private String sName;
	// 学生性别
	private String sSex;
	// 学生年龄
	private Integer sAge;
	// 学生籍贯
	private String sAddress;
	// 学生班级id
	private String sBid;
	// 课程集合
	private List<Course> course;

	// 学生考勤集合
	private List<StudentKaoqin> stuKq;
	// 班级
	private Classbj cbj;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsSex() {
		return sSex;
	}

	public void setsSex(String sSex) {
		this.sSex = sSex;
	}

	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsBid() {
		return sBid;
	}

	public void setsBid(String sBid) {
		this.sBid = sBid;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<StudentKaoqin> getStuKq() {
		return stuKq;
	}

	public void setStuKq(List<StudentKaoqin> stuKq) {
		this.stuKq = stuKq;
	}

	public Classbj getCbj() {
		return cbj;
	}

	public void setCbj(Classbj cbj) {
		this.cbj = cbj;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sNo=" + sNo + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge
				+ ", sAddress=" + sAddress + ", sBid=" + sBid + ", course=" + course + ", stuKq=" + stuKq + ", cbj="
				+ cbj + "]";
	}

}
