package com.kh.example.chap02_abstractNInterface.family.controller;

import com.kh.example.chap02_abstractNInterface.family.model.vo.Baby;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Basic;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
////		Family f = new Family();
//		// Family�� �߻�Ŭ������ ������ ��ü ���� �Ұ�
//		
//		Family f1 = new Mother("��Ӵ�",50,70,"���");
//		Family f2 = new Baby("���̺�", 3.5, 70);
//		// �ڽ� Ŭ������ ��ü�� Family�� ���� �� ���� ==> ������
//		
//		System.out.println(f1);
//		System.out.println(f2); // ���� ���ε� 
//		// �ڽĿ� �ִ� �������̵� �� toString�޼ҵ尡 �켱�� �Ǿ�
//		// �θ��� toString�� �ƴ� �ڽ��� toString�� ������ �� 
//		
//		f1.eat(); // ��Ӵ� ���� �����
//		f2.eat(); // ���̺� ���� ���� 
//		
//		f1.sleep(); // ��Ӵ� ���ڸ��� ��� 
//		f2.sleep(); // ���̺� �޳���� 
//		
//		System.out.println("=== ������ ===");
//		System.out.println(f1);
//		System.out.println(f2);
//		
//		
//		f1.overrideTest();
//		/*
//		 * MotherŬ���������� Family�� overrideTest�޼ҵ带 �������̵������ʾƼ� 
//		 * Family�� overrideTest�� ����*/
//		f2.overrideTest();
//		/*
//		 * BabyŬ���������� Family�� overrideTest�޼ҵ带 �������̵� �߱⶧���� 
//		 * Baby�� overrideTest�� ����*/
//		Basic b = new Basic(); 
		// Basic�� �������̽��̱� ������ ��ü ���� �Ұ�

		Basic b1 = new Mother("��Ӵ�", 50, 70, "���");
		Basic b2 = new Baby("���̺�", 3.5, 70);

		System.out.println(b1);
		System.out.println(b2);

		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();

		System.out.println("====������====");
		System.out.println(b1);
		System.out.println(b2);

		((Mother) b1).overrideTest();
		((Baby) b2).overrideTest();

	}

}
