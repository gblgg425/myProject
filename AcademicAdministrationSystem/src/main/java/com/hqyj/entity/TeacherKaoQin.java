package com.hqyj.entity;

public class TeacherKaoQin {

	private int tkid;
	// 老师id
	private int fk_tkid;
	// 考勤情况
	private String tcontion;

	public int getTkid() {
		return tkid;
	}

	public void setTkid(int tkid) {
		this.tkid = tkid;
	}

	public int getFk_tkid() {
		return fk_tkid;
	}

	public void setFk_tkid(int fk_tkid) {
		this.fk_tkid = fk_tkid;
	}

	public String getTcontion() {
		return tcontion;
	}

	public void setTcontion(String tcontion) {
		this.tcontion = tcontion;
	}

}
