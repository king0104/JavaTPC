import kr.tpc.BookVO;

public class TPC12 {

	public static void main(String[] args) {
		// 생성자 = 객체 생성 & 객체 초기화  
		// - 초기화는 '중복 정의' 필요
		
		BookVO b1=new BookVO();
		System.out.println(b1.title+"\t");
		System.out.println(b1.price+"\t");
		System.out.println(b1.company+"\t");
		System.out.println(b1.page+"\t");
		
		BookVO b2=new BookVO("python", 18000, "대림", 670);
		System.out.println(b2.title+"\t");
		System.out.println(b2.price+"\t");
		System.out.println(b2.company+"\t");
		System.out.println(b2.page+"\t");
		
	}

}
