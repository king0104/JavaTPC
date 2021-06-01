import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

	public static void main(String[] args) {
		// dog, cat --> animal
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		//Dog.java(x) Dog.class(o)
		//Dog dd = new Dog();
		
		// Animal <---[Dog.class, Cat.class]
		// 리모컨으로 dog, cat 클래스의 것들 구동시키는 작업
		
		// Dog dd = new Dog();
		// dd.eat();
		
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		

	}

}
