package com.kh.example.chap01_poly.test.model.vo;

public class Parent {
	private int x;
	private int y;

	public Parent() {
	}

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int setY() {
		return y;
	}
	
	public void printParent() {
		System.out.println("�� �θ�� ");
	}

}
