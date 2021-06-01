package kr.poly;

public class Radio implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("radio 채널 올라감");
		
	}

	@Override
	public void chDown() {
		System.out.println("radio 채널 내려감");
		
	}

	@Override
	public void internet() {
		System.out.println("radio는 인터넷이 지원되지 않는다");
		
	}

	
	
}
