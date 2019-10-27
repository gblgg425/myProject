package com.hqyj.entity;

public class StudentKaoqin {
	private int skId;
	private int fk_skId;
	private String sContion;

	@Override
	public String toString() {
		return "StudentKaoqin [skId=" + skId + ", fk_skId=" + fk_skId + ", sContion=" + sContion + "]";
	}

	public int getSkId() {
		return skId;
	}

	public void setSkId(int skId) {
		this.skId = skId;
	}

	public int getFk_skId() {
		return fk_skId;
	}

	public void setFk_skId(int fk_skId) {
		this.fk_skId = fk_skId;
	}

	public String getsContion() {
		return sContion;
	}

	public void setsContion(String sContion) {
		this.sContion = sContion;
	}
}
