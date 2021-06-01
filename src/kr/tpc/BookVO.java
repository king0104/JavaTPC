package kr.tpc;
// < 객체 생성 -> class 만들기 >

// 책 -> 제목, 가격, 출판사, 페이지수 ...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 1. 생성자의 역할
	public BookVO() {
		// 1. 객체 생성(코드에는 안보이지만 객체를 먼저 생성함)
		// 2. 객체 초기화
		this.title="자바";
		this.price=14000;
		this.company="이지스";
		this.page=780;
	}
	
	
	
	// 2. 생성자 중복 정의(overloading) - 디볼트생성자와 이름은 같지만 매개변수가 다름
	public BookVO(String title, int price, String company, int page) {
		this.title=title;
		this.price=price;
		this.company=company;
		this.page=page;
	}
}
	
	// 추가
	// 생성자 하나가 만들어지면, 디폴트 생성자는 자동으로 만들어지지 않는다!!
