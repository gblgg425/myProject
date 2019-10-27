package com.hqyj.entity;

public class PageType {

	//起始位置
	private int start;
	//每页条数
	private int size=3;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
