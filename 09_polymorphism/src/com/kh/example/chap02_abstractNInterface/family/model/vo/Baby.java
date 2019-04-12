package com.kh.example.chap02_abstractNInterface.family.model.vo;

public class Baby extends Family {

	public Baby() {
	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	public String toString() {
		return "Baby [ " + super.toString() + "]";
	}

	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 3);

	}

	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 3);

	}

	@Override
	public void overrideTest() {
		System.out.println("Baby");

	}
	// 상위 클래스의 추상 메소드가 아닌 일반 메소드는
	// 강제 오버라이딩이 들어가지 않음
}
