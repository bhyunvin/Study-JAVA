package tj.exam.ex01;

class Calculator {
	static double PI = 3.14;
	static int base = 0;
	int left;
	int right;

	public void setOp(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right + base);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2 + base);
	}
}

public class ObjectCalcEx {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOp(10, 20);
		c1.sum();
		c1.avg();

		Calculator c2 = new Calculator();
		c2.setOp(20, 40);
		c2.sum();
		c2.avg();

		System.out.println(Calculator.PI);

	}
}
