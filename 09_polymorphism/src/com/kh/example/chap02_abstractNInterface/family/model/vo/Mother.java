package com.kh.example.chap02_abstractNInterface.family.model.vo;

public class Mother extends Family  implements Basic {
	private String babyBirth; // 아이의 탄생: 출산, 입양, 없음

	public Mother() {
	}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public String toString() {
		return "Mother [" + super.toString() + ", babyBirth=" + babyBirth + "]";
	}
	//추상 클래스를 상속 받았기 때문에 
	// 부모 클래스의 추상 메소드를 강제로 오버라이딩 시켜
	// 완성시켜줘야함
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 5);
		
	}

	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 10);

	}
}
