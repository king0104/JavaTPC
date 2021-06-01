
public class TPC09 {

	// 1. method area : 메모리 할당되는 공간
		// static zone, non static zone으로 구분
		// static zone에 main 함수 있으므로 메서드가 static zone에 있어야 호출 가능
		// static zone에 없는 메서드는 따로 작업 필요
	
	// 2. stack area : 함수가 call 되는 공간
		// 여기서 함수들이 실행되는 곳.
		// stack area에 함수를 올려야 함수 실행 가능
		// 1. static은 자동으로 올라감 - main 함수가 static 이므로
		// 2. non static은 다른 작업 필요  
	
	//  3. heap area : non static zone을 가리키기 위해 생성되는 공간을 저장하는 영역

	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		
		// tpc 객체 생성 
		// 1. Heap Area에 생성된다
		// 2. sum() 함수를 가지고 있음(포인터 형태로)
			// 이 포인터는 method area(메모리 영역)에 sum()함수를 가리키고 있다
			// tpc.sum을 통해 non static zone에 있는 sum()함수를 가리킬 수 있고,
			// 그렇게 stack zone에 sum()함수를 가져와서
			// main 함수 내에서 sum()함수 호출 가능하도록 한다.
		TPC09 tpc = new TPC09();
		int v = tpc.sum(a,b);
		System.out.println(v);

	}

	public int sum(int a, int b)
	{
		int v=a+b;
		return v;
	
	}
}
