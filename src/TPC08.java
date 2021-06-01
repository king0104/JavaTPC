
public class TPC08 {
	// static 키워드 : 함수 실행 전, static zone에 메모리 로딩해주는 역할
	// 같은 static zone에 메모리 로딩되어있어야 함수 call 가능!
	
	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		int v = add(a,b); // static method call
		System.out.println(v);

	}
	
	// static zone에 메모리 로딩시키기
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}

}
