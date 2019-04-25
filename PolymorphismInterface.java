package day01;
/*
interface I{}
class C implements I{}
public class PolymorphismInterface {
    public static void main(String[] args) {
        I obj = new C();
    }
} //클래스가 구현하고있는 인터페이스를 객체의 데이터타입으로 지정할 수 있다.
*/

interface I6 {
	public String A();
}

interface I7 {
	public String B();
}

class E implements I6, I7 {
	public String A() {
		return "A";
	}

	public String B() {
		return "B";
	}
}

public class PolymorphismInterface {
	public static void main(String[] args) {
		E obj = new E();
		I6 objI2 = new E();
		I7 objI3 = new E();

		obj.A();
		obj.B();

		objI2.A();
		// objI2.A();

		// objI3.A();
		objI3.B();
	}
}