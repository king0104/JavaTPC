
public class TPC04 {

	public static void main(String[] args) {
		// 4. 데이터를 이동하라(변수 vs 배열) - ** 배열 사용 이유 : 많은 데이터 한번에 이동하기 편리(바구니 역할) **
		int a,b,c;
		a=10;
		b=20;
		c=30;
		
		// a+b+c=? 메서드 처리 -> hap()
		//1. 변수 사용
		hap(a,b,c);
		
		// **배열도 객체이다.**
		int[] arr; // 1. 객체 선언
		arr = new int[3]; // 2. 객체 생성
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		// 2. 배열 사용
		hap1(arr);
	}
	
	// 1. 변수로 메서드 매개변수 입력 받기
	public static void hap(int x, int y, int z) { 
		int sum = x+y+z;
		System.out.println(sum);
	}

	// 2. 배열로 메서드 매개변수 입력 받기
	public static void hap1(int[] x) { // **장점 : 훨씬 더 간결한 코드 작성 가능!!**
		
		// 반복문 활용
		int sum =0;
		for(int i=0; i<x.length ; i++) // **배열의 길이 => arr.length**
		{
			sum+=x[i];
		}
		System.out.println(sum);
	}
}
