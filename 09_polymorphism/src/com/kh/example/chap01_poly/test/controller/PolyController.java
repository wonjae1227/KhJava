package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	// 다형성
	// 부모타입으로부터 파생된 = 상속받은
	// 여러가지 자식타입의 객체를
	// 부모 타입 하나로 다룰 수있는 기술
	public void method() {
		/*
		 * 다형성 부모타입으로 부터 파생된 = 상속받은 여러가지 자식 타입의 객체를 부모 타입 하나로 다룰 수 있는 기술
		 */

		// 1. 부모타입 레퍼런스로 부모 객체를 담을 때

		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 담을 때");
		Parent p1 = new Parent();
		// 부모타입 레퍼런스 부모 객체
		p1.printParent();
		// p1레퍼런스로 Parent에만 접근 가능

		System.out.println();

		// 2. 자식 타입 레퍼런스로 자식 객체를 담을 때
		System.out.println("2. 자식 타입 레퍼런스로 자식 객체를 담을 때");
		Child1 c1 = new Child1();
		// 자식타입 레퍼런스 자식 객체
		c1.printChild1();
		c1.printParent(); // 부모를 상속받아서 부모메소드 접근 가능

		System.out.println();

		// 3. 부모 타입 레퍼런스로 자식 객체를 담을 때
		System.out.println("3. 부모 타입 레퍼런스로 자식 객체를 담을 때");
		Parent p2 = new Child2(); // 다형성
		/*
		 * 부모타입 레퍼런스 자식 객체 업 캐스팅 부모 타입의 참조형 변수가 모든 자식 객체를 받을 수 있는것 형변환 생략 가능
		 */

		p2.printParent();

		// p2.printChild2(); => 에러남
		((Child2) p2).printChild2();
		/*
		 * 다운 캐스팅 부모 타입의 참조형 변수가 자식을 받울 수는 있지만 안에있는 자식 객체를 볼수는 없음 자식 객체에 접근하기 위해서는
		 * 자식타입으로 형변환 필요 형변환 생략 불가
		 */

		System.out.println();

		// 4. 자식 타입 레퍼런스로 부모 객체를 담을 때
		System.out.println("4. 자식 타입 레퍼런스로 부모 객체를 담을 때");
		// Child2 c2 = new Parent();
		// 자식은 부모를 받을 수 없음.

		System.out.println();
		System.out.println("==== 객체 배열 만들기 ====");
		System.out.println();

		Parent[] pArr = new Parent[4]; // 정적바인딩
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();

		for (int i = 0; i < pArr.length; i++) {
			/*
			 * pArr[i]가 어떤 객체인지 알아내기 위해 instanceof 사용
			 */
//		         if(pArr[i] instanceof Child1) {
//		            ((Child1)pArr[i]).printChild1();
//		         }
//		         else if(pArr[i] instanceof Child2) {
//		            ((Child2)pArr[i]).printChild2();
//		         }

			pArr[i].print(); // 동적바인딩 해줌

			/*
			 * 정적 바인딩 프로그램 실행 전 컴파일 단계에서, 메소드와 메소드 호출부 연겨 ㄹ 상속관계로 이루어져 다형성이 적용되고 자식이 부모 메소드를
			 * 오버라이딩 한 경우라도 컴파일 단계에서는 오버라이딩 전 부모 메소드를 바인딩
			 * 
			 */

			/*
			 * 동적 바인딩 프로그램 실행중 컴파일 할때 정적 바인딩 된 메소드를 실행할 시 객체 생성한 타입으로 바인딩 된 것 삭속 관계로 이루어져
			 * 다형성이 적용된 경우, 메소드 오버라이딩이 되어 있으면 정적 바인딩된 메소드 코드보다 오버라이딩 된 메소드를 우선적으로 실행 *
			 */
		}

	}

}
