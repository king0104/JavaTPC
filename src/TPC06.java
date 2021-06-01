
public class TPC06 {

	public static void main(String[] args) {
	// 5. 메서드 -> 동작(method), 기능(function)
	// static 메서드에서 다른 메서드 호출 시 호출되는 메서드도 static이어야 함
	int a=67;
	int b=98;
	
	// 메서드 : '하나의 값'으로 리턴함
	int result = sum(a,b);
	System.out.println(result);
	
	// 3개를 리턴하고 싶을 때  : 배열로 하나로 묶기
	int []arr = makeArr();
	int hap=0;
	for(int i=0; i<arr.length;i++) {
		hap+=arr[i];
	}
	System.out.println(hap);
	
	}

	// 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
	public static int sum(int a, int b) { // static : 메모리 로딩 되어있어야 함.
		int v = a + b;
		return v;
	}
	
	// 3개를 리턴하고 싶을 때  : 배열로 하나로 묶기
	public static int[] makeArr() {
		int x=10;
		int y=20;
		int z=30;
		
		int[]arr=new int[3]; // 배열 객체 생성
		arr[0]=x;
		arr[1]=y;
		arr[2]=z;
		
		return arr;
				
	}
}
