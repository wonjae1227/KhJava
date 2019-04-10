package com.kh.example.chap01_poly.electronic.model.vo;

public class Tablet extends Electronic {

	private boolean penFlag;

	public Tablet() {

	}

	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}

	public boolean gettpenFlag() {
		return penFlag;
	}

	public String toString() {
		return "Table [" + super.toString() + ",penFlag=" + penFlag + "]";
	}

}
