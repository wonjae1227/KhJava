package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	// ������
	// �θ�Ÿ�����κ��� �Ļ��� = ��ӹ���
	// �������� �ڽ�Ÿ���� ��ü��
	// �θ� Ÿ�� �ϳ��� �ٷ� ���ִ� ���
	public void method() {
		/*
		 * ������ �θ�Ÿ������ ���� �Ļ��� = ��ӹ��� �������� �ڽ� Ÿ���� ��ü�� �θ� Ÿ�� �ϳ��� �ٷ� �� �ִ� ���
		 */

		// 1. �θ�Ÿ�� ���۷����� �θ� ��ü�� ���� ��

		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� ���� ��");
		Parent p1 = new Parent();
		// �θ�Ÿ�� ���۷��� �θ� ��ü
		p1.printParent();
		// p1���۷����� Parent���� ���� ����

		System.out.println();

		// 2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü�� ���� ��
		System.out.println("2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü�� ���� ��");
		Child1 c1 = new Child1();
		// �ڽ�Ÿ�� ���۷��� �ڽ� ��ü
		c1.printChild1();
		c1.printParent(); // �θ� ��ӹ޾Ƽ� �θ�޼ҵ� ���� ����

		System.out.println();

		// 3. �θ� Ÿ�� ���۷����� �ڽ� ��ü�� ���� ��
		System.out.println("3. �θ� Ÿ�� ���۷����� �ڽ� ��ü�� ���� ��");
		Parent p2 = new Child2(); // ������
		/*
		 * �θ�Ÿ�� ���۷��� �ڽ� ��ü �� ĳ���� �θ� Ÿ���� ������ ������ ��� �ڽ� ��ü�� ���� �� �ִ°� ����ȯ ���� ����
		 */

		p2.printParent();

		// p2.printChild2(); => ������
		((Child2) p2).printChild2();
		/*
		 * �ٿ� ĳ���� �θ� Ÿ���� ������ ������ �ڽ��� �޿� ���� ������ �ȿ��ִ� �ڽ� ��ü�� ������ ���� �ڽ� ��ü�� �����ϱ� ���ؼ���
		 * �ڽ�Ÿ������ ����ȯ �ʿ� ����ȯ ���� �Ұ�
		 */

		System.out.println();

		// 4. �ڽ� Ÿ�� ���۷����� �θ� ��ü�� ���� ��
		System.out.println("4. �ڽ� Ÿ�� ���۷����� �θ� ��ü�� ���� ��");
		// Child2 c2 = new Parent();
		// �ڽ��� �θ� ���� �� ����.

		System.out.println();
		System.out.println("==== ��ü �迭 ����� ====");
		System.out.println();

		Parent[] pArr = new Parent[4]; // �������ε�
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();

		for (int i = 0; i < pArr.length; i++) {
			/*
			 * pArr[i]�� � ��ü���� �˾Ƴ��� ���� instanceof ���
			 */
//		         if(pArr[i] instanceof Child1) {
//		            ((Child1)pArr[i]).printChild1();
//		         }
//		         else if(pArr[i] instanceof Child2) {
//		            ((Child2)pArr[i]).printChild2();
//		         }

			pArr[i].print(); // �������ε� ����

			/*
			 * ���� ���ε� ���α׷� ���� �� ������ �ܰ迡��, �޼ҵ�� �޼ҵ� ȣ��� ���� �� ��Ӱ���� �̷���� �������� ����ǰ� �ڽ��� �θ� �޼ҵ带
			 * �������̵� �� ���� ������ �ܰ迡���� �������̵� �� �θ� �޼ҵ带 ���ε�
			 * 
			 */

			/*
			 * ���� ���ε� ���α׷� ������ ������ �Ҷ� ���� ���ε� �� �޼ҵ带 ������ �� ��ü ������ Ÿ������ ���ε� �� �� ��� ����� �̷����
			 * �������� ����� ���, �޼ҵ� �������̵��� �Ǿ� ������ ���� ���ε��� �޼ҵ� �ڵ庸�� �������̵� �� �޼ҵ带 �켱������ ���� *
			 */
		}

	}

}
