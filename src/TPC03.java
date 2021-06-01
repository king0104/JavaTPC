import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// 3. 관계를 이해하라. PDT vs UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오
		
		int a;
		a=10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		
		Book b; // 1. 변수 선언
		// b : 객체 변수 = 인스턴스 변수 (객체라고 하면 그냥 b라고 통용해서 말함)
		// b라는 변수 안에는 객체 생성한 것(vo)의 첫번째 주소가 들어간다.
		
		// vo : 실제로 b가 가리키는 객체덩어리를 말한다.
		
		b = new Book(); // 2. 객체 생성
		// 실체 = 인스턴스.
		
		b.title = "자바";
		b.price=15000;
		b.company = "한빛미디어";
		b.page = 700;
		
		System.out.println(b.title+"\t");
		System.out.println(b.title+"\t");
		System.out.println(b.title+"\t");
		System.out.println(b.title+"\t");
		
		// 사람 정보 저장하기 위한 변수를 선언하시오.
		PersonVO p;
		p=new PersonVO();
		p.name="윤수빈";
		p.age=40;
		p.weight=68.4f;
		p.height=175.7f;
		
	}

}
