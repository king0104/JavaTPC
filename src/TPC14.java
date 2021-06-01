import kr.tpc.MemberVO;

public class TPC14 {

	public static void main(String[] args) {
		
		MemberVO m = new MemberVO();
		
		// 1. private 멤버 직접 접근 불가능
		/*
		m.name="홍길동";
		m.age=1000;
		*/
		
		// 2. 메서드로 private 멤버 접근
		m.setName("홍길동");
		m.setAge(100);
		m.setTel("01095847464");
		m.setAddr("서울");
		

	}

}
