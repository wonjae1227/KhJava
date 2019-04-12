package com.kh.example.chap02_abstractNInterface.family.controller;

import com.kh.example.chap02_abstractNInterface.family.model.vo.Baby;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Family;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();
		// Family�� �߻�Ŭ������ ������ ��ü ���� �Ұ�
		
		Family f1 = new Mother("��Ӵ�",50,70,"���");
		Family f2 = new Baby("���̺�", 3.5, 70);
		// �ڽ� Ŭ������ ��ü�� Family�� ���� �� ���� ==> ������
		
		System.out.println(f1);
		System.out.println(f2); // ���� ���ε� 
		// �ڽĿ� �ִ� �������̵� �� toString�޼ҵ尡 �켱�� �Ǿ�
		// �θ��� toString�� �ƴ� �ڽ��� toString�� ������ �� 
		
		f1.eat(); // ��Ӵ� ���� �����
		f2.eat(); // ���̺� ���� ���� 
		
		f1.sleep(); // ��Ӵ� ���ڸ��� ��� 
		f2.sleep(); // ���̺� �޳���� 
		
		System.out.println("=== ������ ===");
		System.out.println(f1);
		System.out.println(f2);
		
		
		f1.overrideTest();
		/*
		 * MotherŬ���������� Family�� overrideTest�޼ҵ带 �������̵������ʾƼ� 
		 * Family�� overrideTest�� ����*/
		f2.overrideTest();
		/*
		 * BabyŬ���������� Famil�� overrideTest�޼ҵ带 �������̵� �߱⶧���� 
		 * Baby�� overrideTest�� ����*/
	}

}
