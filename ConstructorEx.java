package tj.exam.ex01;

class CalculatorEx {
	int left, right;

	public CalculatorEx(int left, int right) { // 클래스와 메서드의 이름이 같다는것이 매우 중요함! 7행의 Calculator = 생성자
		this.left = left; // 생성자의 역할 = 클래스가 생성될때 자동으로 클래스와 똑같은 이름을 가지고있는 생성자가 실행되도록 약속되어있음
		this.right = right; // 그리고 이 생성자가 어떤 메서드보다 가장 먼저 실행되도록 약속되어있음
	}

	public void sum() {
		System.out.println(left + right);
	}

	public void avg() {
		System.out.println((left + right) / 2);
	}
}

public class ConstructorEx {
	public static void main(String[] args) {
		CalculatorEx c1 = new CalculatorEx(10, 20);
		c1.sum();
		c1.avg();
		CalculatorEx c2 = new CalculatorEx(20, 40);
		c2.sum();
		c2.avg();

	}
}