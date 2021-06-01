import kr.tpc.BookDTO;
// DTO : transfer object 
// 배열로 값들 전달? -> 자료형 다르면 불가능
// 클래스 만들어서 값 전달!!

// 클래스 = 바구니 역할 = DTO

public class TPC13 {

	public static void main(String[] args) {
		String title = "스프링";
		int price = 19000;
		String company = "제이펍";
		int page = 900;

		// transfer용 바구니 = class
		BookDTO dto; // dto(1. Object : 객체)
		dto = new BookDTO(title, price, company, page); // dto(2. Instance : 인스턴스)
		
		// class로 값 전달 = 바구니 역할
		bookPrint(dto);
	}

	public static void bookPrint(BookDTO dto) {
		System.out.println(dto.title+"\t");
		System.out.println(dto.price+"\t");
		System.out.println(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}
}
