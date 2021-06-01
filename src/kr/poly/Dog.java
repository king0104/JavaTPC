package kr.poly;

public class Dog extends Animal {
	// 재정의(Override)
	
	
	// 생성자
	public Dog() {
		super(); // 부모의 생성자 호출 -> 1. 부모의 객체 먼저 생성
		// 2. 부모 객체 생성 후 Dog 객체 생성
	}

	@Override
	public void eat() {
		System.out.println("개가 먹는다");
		
	}
	
}
