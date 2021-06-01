import kr.tpc.*;

public class TPC29 {

	public static void main(String[] args) {
		
		A a = new A();
		display(a);
		
		
		B b = new B();
		display(b);

	}

	// 다형성 인수로 받기 - 부모 클래스 이용
	private static void display(Object o) {
		// 사용 시에 downcasting
		if(o instanceof A)
			((A)o).go();
		else
			((B)o).go();
	}

	

}
