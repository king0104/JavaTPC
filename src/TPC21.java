import kr.tpc.*;

public class TPC21 {

	public static void main(String[] args) {
		
		// upcasting & 다형성
		// 상속 체이닝
		// 1. 객체 생성(간접)
		Animal ani=new Dog();
		// override
		// 2. 객체의 메서드 호출
		ani.eat();
		
		// upcasting & 다형성
		ani = new Cat();
		ani.eat();
		
	}

}
