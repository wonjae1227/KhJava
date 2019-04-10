package com.kh.example.chap01_poly.test.run;

import com.kh.example.chap01_poly.test.controller.PolyController;
import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		PolyController pc = new PolyController();
		pc.method();
		// 1. �θ�Ÿ�� ���۷����� �θ� ��ü�� ������
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� ���� ��");
		Parent p1 = new Parent();
		// �θ�Ÿ�� ���۷��� �� �θ�ü
		p1.printParent();
		// p1���۷����� Parent���� ���ٰ���

		System.out.println();

		// 2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü�� ���� ��
		System.out.println("2.�ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� ������ ");
		Child1 c1 = new Child1();
		// ���ڽ�Ÿ�� ���۷��� ���ڽİ�ü
		c1.printChild1(); // �ڱ� �ȿ� �ִ� �޼ҵ� ���� ����
		c1.printParent(); // �ڱ� �ȿ� �θ� ������ �θ� �޼ҵ� ���� ����

		System.out.println();

		// 3. �θ� Ÿ�� ���۷����� �ڽ� ��ü�� ���� ��
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� ������");
		Parent p2 = new Child2();
		// ��ĳ���� = �θ� Ÿ���� ������ ������ ��� �ڽ� ��ü�� ���� �� �ִ� ��
		// ����ȯ ���� ����
		// ��, p2���� ���̴� ���� Parent ����
		p2.printParent();
		((Child2) p2).printChild2();
		// �ٿ�ĳ����
		// �θ� Ÿ���� ������ ������ �ڽ��� ���� ���� ������
		// �ȿ��ִ� �ڽ� ��ü�� ������ ����
		// �ڽ� ��ü�� �����ϱ� ���ؼ��� �ڽ� Ÿ������ ����ȯ �ʿ�
		// ����ȯ ���� �Ұ���

		// 4. �ڽ� Ÿ�� ���۷����� �θ� ��ü�� ���� ��
		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü�� ���� �� ");
//		Child c2 = new Parent();
		// �ڽ��� �θ� ���� �� ���� ]
//		Child2 c2 = (Child2)(new Parent());
//		Child2 c2 = (Child2)p1;

		System.out.println();
		System.out.println("=====��ü �迭 ����� =====");
		System.out.println();

		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1(); // ������
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();

		for (int i = 0; i < pArr.length; i++) {
			// pArr[i] �ȿ� ��� ��ü ��ü�� ����ϰ� ���� ��
			// �� ��ü�� � ��ü���� �˾Ƴ��� ���ؼ�
			// instanceof ������ ���
			if (pArr[i] instanceof Child1) {
				((Child1) pArr[i]).printChild1();
			} else if (pArr[i] instanceof Child2) {
				((Child2) pArr[i]).printChild2();
			}

		}

	}

}
