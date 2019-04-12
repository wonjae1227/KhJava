package com.kh.example.chap02_abstractNInterface.family.controller;

import com.kh.example.chap02_abstractNInterface.family.model.vo.Baby;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Family;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();
		// Family는 추상클래스기 때문에 객체 생성 불가
		
		Family f1 = new Mother("어머니",50,70,"출산");
		Family f2 = new Baby("베이비", 3.5, 70);
		// 자식 클래스의 객체를 Family가 받을 수 있음 ==> 다형성
		
		System.out.println(f1);
		System.out.println(f2); // 동적 바인딩 
		// 자식에 있는 오버라이딩 한 toString메소드가 우선시 되어
		// 부모의 toString이 아닌 자식의 toString이 나오게 됨 
		
		f1.eat(); // 어머니 진지 잡수심
		f2.eat(); // 베이비 분유 마심 
		
		f1.sleep(); // 어머니 잠자리에 드심 
		f2.sleep(); // 베이비 꿈나라로 
		
		System.out.println("=== 다음날 ===");
		System.out.println(f1);
		System.out.println(f2);
		
		
		f1.overrideTest();
		/*
		 * Mother클래스에서는 Family의 overrideTest메소드를 오버라이딩하지않아서 
		 * Family의 overrideTest가 실행*/
		f2.overrideTest();
		/*
		 * Baby클래스에서는 Famil의 overrideTest메소드를 오버라이딩 했기때문에 
		 * Baby의 overrideTest가 실행*/
	}

}
