import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
	
	// 2. 다형성 배열
	// Dog, Cat 저장할 배열 생성하시오
	public static void main(String[] args) {
	
		// _1. 다형성 배열 만들기
		Animal[] ani=new Animal[2];
		ani[0]=new Dog();
		ani[1]=new Cat();
		
		for(int i=0;i<ani.length;i++)
		{
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
			
		}
		
		// _2. 다형성 배열을 다형성 인수로 받는 메서드
		display(ani);
	}
	
	// 2. 다형성 인수 사용
	private static void display(Animal[] ani) { // 인수로 다형성 배열 사용
		for(int i=0;i<ani.length;i++)
		{
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
			
		}
	}
	

}
