import kr.tpc.*;

public class TPC23 {

	public static void main(String[] args) {
		Dog d=new Dog();
		display(d);
		
		Cat c=new Cat();
		display(c);
		

	}
	
	/*
	1. 다형성 인수 사용하지 않을 때 메서드 여러개 써야함
	private static void display(Cat c) {
		
		
	}

	private static void display(Dog d) {
		
		
	}
	*/
	
	// 2. 다형성 인수 사용
	private static void display(Animal r) { // 다형성 - upcasting
		r.eat();
		
		if( r instanceof Cat) {
			((Cat)r).night(); // downcasting
		}
		
	}

}
