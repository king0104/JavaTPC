package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 디폴트 생성자 매서드(생략)
	public BookDTO() {
		// 객체를 생성하는 작업 수행.(=기억 공간을 만드는 작업)
		// - 이때 this라는 객체가 하나 만들어진다 - 자기 자신을 가리키는 객체
	}
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	

}
