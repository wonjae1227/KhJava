package com.kh.example.chap01_poly.test.run;

import com.kh.example.chap01_poly.test.controller.PolyController;
import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		PolyController pc = new PolyController();
		pc.method();
		// 1. 부모타입 레퍼런스로 부모 객체를 담을때
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 담을 때");
		Parent p1 = new Parent();
		// 부모타입 레퍼런스 ㄴ 부모객체
		p1.printParent();
		// p1레퍼런스로 Parent에만 접근가능

		System.out.println();

		// 2. 자식 타입 레퍼런스로 자식 객체를 담을 때
		System.out.println("2.자식타입 레퍼런스로 자식 객체를 담을때 ");
		Child1 c1 = new Child1();
		// ㄴ자식타입 레퍼런스 ㄴ자식객체
		c1.printChild1(); // 자기 안에 있는 메소드 접근 가능
		c1.printParent(); // 자기 안에 부모도 있으니 부모 메소드 접근 가능

		System.out.println();

		// 3. 부모 타입 레퍼런스로 자식 객체를 담을 때
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 담을때");
		Parent p2 = new Child2();
		// 업캐스팅 = 부모 타입의 참조형 변수가 모든 자식 객체를 받을 수 있는 것
		// 형변환 생략 가능
		// 단, p2에서 보이는 것은 Parent 뿐임
		p2.printParent();
		((Child2) p2).printChild2();
		// 다운캐스팅
		// 부모 타입의 참조형 변수가 자식을 받을 수는 있지만
		// 안에있는 자식 객체를 볼수는 없음
		// 자식 객체에 접근하기 위해서는 자식 타입으로 형변환 필요
		// 형변환 생략 불가능

		// 4. 자식 타입 레퍼런스로 부모 객체를 담을 때
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 담을 때 ");
//		Child c2 = new Parent();
		// 자식은 부모를 받을 수 없음 ]
//		Child2 c2 = (Child2)(new Parent());
//		Child2 c2 = (Child2)p1;

		System.out.println();
		System.out.println("=====객체 배열 만들기 =====");
		System.out.println();

		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1(); // 다형성
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();

		for (int i = 0; i < pArr.length; i++) {
			// pArr[i] 안에 담긴 객체 전체를 출력하고 싶을 때
			// 그 객체가 어떤 객체인지 알아내기 위해서
			// instanceof 연산자 사용
			if (pArr[i] instanceof Child1) {
				((Child1) pArr[i]).printChild1();
			} else if (pArr[i] instanceof Child2) {
				((Child2) pArr[i]).printChild2();
			}

		}

	}

}
