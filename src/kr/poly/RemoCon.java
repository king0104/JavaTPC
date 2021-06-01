package kr.poly;

public interface RemoCon { // 불완전한 클래스 -> 객체 생성 불가능.

	// 인터페이스에 적을 수 있는 내용
	
	// 1. 변수
	// 상수(=final static이 붙은 변수) 사용 가눙
	public static final int MAXCH = 100;
	int MINCH = 1;
	// + static이 붙으면 객체 생성 하지 않고 클래스 이름으로 변수에 바로 접근 가능
	
	
	// 2. 메서드
	// 추상메서드
	public void chUp();
	public void chDown();
	public void internet();

}
