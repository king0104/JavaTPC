package kr.inflearn;

// default : 의미적으로 해석
// 접근제어자 생략 시에 default 접근 제어자가 생겨나서
// 1. 클래스끼리는 같은 클래스 내부에서만 접근 가능
// 2. 외부에서 클래스 접근 불가능
public class MyClass {
	public int sum(int a, int b) {
		int hap = 0;
		for(int i=a;i<b;i++)
			hap+=i;
		return hap;
	}
	
}
