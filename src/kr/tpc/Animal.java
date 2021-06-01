package kr.tpc;

public class Animal {
	// Dog, Cat --> eat()
	public void eat() {
		System.out.println("?"); // 포괄적, 추상적
	}
	
	// 생성자
	public Animal() {
		super(); // 부모의 생성자 호출 -> 1. 부모의 객체 먼저 생성( Object() )
		// 2. 부모 객체 생성 후 Animal 객체 생성
	}
}
