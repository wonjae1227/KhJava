package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
	// 인터페이스는 다중 상속 지원 (상속 여러개 가능 )
	// 내용물이 없이 텅텅 비어있는 인터페이스 = Marker Interface
	// 메소드 구현 목적이 아닌 클래스의 특성을 나타내주기 위해서 사용 
	
	// 인터페이스에서 필드는 항상 상수필드
	public static final double a = 1.0;

	// 인터페이스에서 메소드는 항상 추상메소드
	/* public abstract */ void eat();

	/* public abstract */ void sleep();
}
