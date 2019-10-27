package com.hqyj.entity;

public class ChengJi {
	// 成绩id
	private int cjId;
	// 课程id
	private int cjcId;
	// 学生id
	private int cjsId;
	// 成绩
	private int score;

	public int getCjId() {
		return cjId;
	}

	public void setCjId(int cjId) {
		this.cjId = cjId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCjcId() {
		return cjcId;
	}

	public void setCjcId(int cjcId) {
		this.cjcId = cjcId;
	}

	public int getCjsId() {
		return cjsId;
	}

	public void setCjsId(int cjsId) {
		this.cjsId = cjsId;
	}

	@Override
	public String toString() {
		return "ChengJi [cjId=" + cjId + ", cjcId=" + cjcId + ", cjsId=" + cjsId + ", score=" + score + "]";
	}

}
