package day01;

class Calculator2 {
	static final double PI = 3.14;
	int left, right;

	public void setOp(int left, int right) {
		this.left = left;
		this.right = right;
		// Calculator2.PI = 6;
	}

	int _sum() {
		return this.left + this.right;
	}

	public void sum() {
		System.out.println(_sum());
	}

	public void avg() {
		System.out.println((_sum()) / 2);
	}
}

public class FinalCalc {
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		System.out.println(c1.PI);
		// Calculator2.PI = 10;
	}
} //Final method와 Class는 extend를 할수없고, 변수라면 값을 변경할수도 없다.