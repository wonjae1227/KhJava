package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
	// �������̽��� ���� ��� ���� (��� ������ ���� )
	// ���빰�� ���� ���� ����ִ� �������̽� = Marker Interface
	// �޼ҵ� ���� ������ �ƴ� Ŭ������ Ư���� ��Ÿ���ֱ� ���ؼ� ��� 
	
	// �������̽����� �ʵ�� �׻� ����ʵ�
	public static final double a = 1.0;

	// �������̽����� �޼ҵ�� �׻� �߻�޼ҵ�
	/* public abstract */ void eat();

	/* public abstract */ void sleep();
}
