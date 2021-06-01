package kr.poly;

public abstract class Animal { // 추상클래스(불완전한 객체) --> Animal ani = new Animal();
	// 추상 클래스 : 다형성을 일부 보장한다.
	
	
	// 1. 추상 메서드
	// 각자의 클래스에서 정의내리는 메서드
	// override 필요
	public abstract void eat(); // 추상메서드 -> 불완전한 메서드, 장애 메서드
	
	// 2. 구현 메서드
	// 부모 클래스에서 정의내려진 메서드
	public void move() { // 구현메서드 
		System.out.println("무리를 지어서 이동한다");
	}
	
	
	
	
	// 생성자
	public Animal() {
		super(); // 부모의 생성자 호출 -> 1. 부모의 객체 먼저 생성( Object() )
		// 2. 부모 객체 생성 후 Animal 객체 생성
	}
}
