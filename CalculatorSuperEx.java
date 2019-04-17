package tj.exam.ex02;

import tj.exam.ex02.Calculator;
import tj.exam.ex02.SubstractCalc;

class Calculator {
	int left, right;

	public void Calcurator() {} // 없다면 자바에서 자동으로 생성될 기본생성자
		// 메서드와 이름이 같음
	
	public Calculator(int left, int right) {
	        this.left = left;
	        this.right = right;
	    }

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

class SubstractCalc extends Calculator {
	
	public SubstractCalc(int left, int right) {
		super(left, right);
		//하위클래스의 초기화코드는 super클래스를 호출한뒤에 나타나야함
		//하위클래스가 인스턴스화된다는것은 -> 상위클래스가 미리 인스턴스화가 되었다는것
		//상위클래스가 미리 초기화가 되어야만 하위클래스를 초기화할수있다
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
	public class CalculatorSuperEx {
		public static void main(String[] args) {

			SubstractCalc sc1 = new SubstractCalc(10, 20);
			sc1.substract();

		}
	}
