package day01;

abstract class AA {
	public abstract int b();
	//메서드중에 하나라도 추상메서드가 있으면 클래스는 무조건 추상클래스가 된다.
	
    //추상메서드는 그 메서드의 시그니쳐만을 가지고있고
	//그것을 구현해내는것은 하위클래스에서 해야한다.
	
	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c(){System.out.println("Hello")}
	//abstract는 8행의 {System.out.println("Hello")} 와같은 로직을 갖고있으면 안된다.
	
	public void d() {
		System.out.println("world");
	}// 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
}

class B extends AA {
	@Override
	public int b() {
		return 1;
	}
}

public class AbstractClassEx {
	public static void main(String[] args) {
		// AA aa = new AA();
		
	}
}