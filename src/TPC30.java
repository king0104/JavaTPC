import kr.tpc.*;

public class TPC30 {
	// <Object class의 사용>

	// 1. 다형성 배열
	public static void main(String[] args) {
		// A, B 클래스 동시에 저장할 배열 만들기
		Object[] o = new Object[2];
		o[0] = new A();
		o[1] = new B();

		for(int i=0; i<o.length;i++)
		{
			if(o[i] instanceof A)
				((A)o[i]).go();
			else
				((B)o[i]).go();
			
		}
		
		printGo(o);
	}

	// 2. 다형성 인수
	private static void printGo(Object[] o) {
		for(int i=0; i<o.length;i++)
		{
			if(o[i] instanceof A)
				((A)o[i]).go();
			else
				((B)o[i]).go();
			
		}
		
	}

}
