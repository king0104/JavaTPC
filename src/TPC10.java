import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		
		int a;
		a = 10;
		
		//BookDTO b = new BookDTO();
		BookDTO b; // 1. 객체 선언
		b = new BookDTO(); // 2. 생성자 매서드 호출 - 객체 생성(메모리 공간 할당)
						   // +이때 this라는 자기 자신을 가리키는 객체도 생성

		b.title = "자바";
		b.price=17000;
		b.company="영신";
		b.page=670;
		
		System.out.println(b.title + "\t");
		System.out.println(b.price + "\t");
		System.out.println(b.company + "\t");
		System.out.println(b.page + "\t");
	}

}
