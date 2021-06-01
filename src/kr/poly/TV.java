package kr.poly;

public class TV implements RemoCon {
	int currCH = 70;

	@Override
	public void chUp() {
		if(currCH<RemoCon.MAXCH) {
			currCH++;
			System.out.println("tv채널 올라감"+currCH);
		}
		else {
			currCH=0;
		}
		
	}

	@Override
	public void chDown() {
		if(currCH > RemoCon.MINCH) {
			currCH--;
			System.out.println("tv채널 내려감"+currCH);
			
		}
		else {
			currCH = 100;
			System.out.println("tv채널 내려감"+currCH);
		}
			
		
	}

	@Override
	public void internet() {
		System.out.println("tv는 인터넷이 된다");
	}
	

}
