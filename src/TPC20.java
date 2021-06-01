import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		
		// override
		// 1. Dog 객체의 내부 설계를 다 알 떄
		Dog d = new Dog(); 
		d.eat(); // animal의 eat이 아니라 dog의 eat 사용
		
		Cat c = new Cat();
		c.eat();
		
		// 2. Dog 객체의 내부 설계 모를 때
		// 부모 객체 Animal 이용 + override
		// "리모컨 역할"
		
		// up casting
		// 자동 형변환 - 자동 객체 형 변환 = object casting
		Animal ani = new Dog(); 
		ani.eat(); // animal의 eat이 아니라 dog의 eat 사용
		
		ani = new Cat(); 
		ani.eat();
		
		//ani.night(); 
		// - 부모 객체 사용 but override 안되어있어서 사용 불가능
		
		((Cat)ani).night();
		// - 그럴땐 그냥 cat객체로 downcasting 해서 사용
	}

}
