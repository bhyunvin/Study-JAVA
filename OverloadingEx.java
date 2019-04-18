package tj.exam.ex05;

class Calculator {
	int left, right /*third*/;
	int third = 0; //위 주석처럼 정의하면 sum과 avg에 this.third가 있고 인자값이 두개뿐일때 third에서 오류가 날수있다

	public void setOp(int left, int right) {
		System.out.println("setOp(int left, int right)");
		this.left = left;
		this.right = right;
	}

	public void setOp(int left, int right, int third) {
		System.out.println("setOp(int left, int right, int third)");
		/*this.left = left;
		this.right = right;*/
		this.setOp(left, right);
		this.third = third;
	}// 이름이 같은데도 (setOp) 충돌하지않고 동작하고있다. 이것이 Overloading 이며,
		// 같은 이름의 메서드가 다른 매개변수의 데이터타입 또는 매개변수의 갯수를 가진다.

	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}

	public void avg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

public class OverloadingEx {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOp(10, 20);
		c1.sum();
		c1.avg();
		c1.setOp(10, 20, 30);
		c1.sum();
		c1.avg();

	}

}