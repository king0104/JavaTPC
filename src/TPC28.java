import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		// 1. toString 재정의 x
		// Object의 toStirng()이 실행됨 => 번지 출력
		// kr.poly.A@2ff4acd0
		
		// 2. toString 재정의 o
		// 문자열 출력
		System.out.println(a); 

		// upcasting
		Object o = new A();
		
		// downcasting
		((A)o).display();
		
		// 부모의 메서드 -> 자식의 메서드가 override
		System.out.println(o.toString());
		
	}

}
