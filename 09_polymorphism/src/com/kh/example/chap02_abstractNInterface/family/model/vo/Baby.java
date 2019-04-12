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
	// ���� Ŭ������ �߻� �޼ҵ尡 �ƴ� �Ϲ� �޼ҵ��
	// ���� �������̵��� ���� ����
}
