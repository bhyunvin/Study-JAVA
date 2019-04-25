package day01;

abstract class Calculator1 {
	int left, right;

	public void setOp(int left, int right) {
		this.left = left;
		this.right = right;
	}
	int _sum() {
		return this.left + this.right;
	} //중복을 제거하기위해서 정의

	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator1 {
	public void sum() {
		System.out.println("+ sum :" + _sum());
	}

	public void avg() {
		System.out.println("+ avg :" + (this.left + this.right) / 2);
	}
}

class CalculatorDecoMinus extends Calculator1 {
	public void sum() {
		System.out.println("- sum :" + (this.left + this.right));
	}

	public void avg() {
		System.out.println("- avg :" + _sum() / 2);
	}
}

public class AbstractCalc {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOp(10, 20);
		c1.run();
		
		System.out.println("----------");
		
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOp(10, 20);
		c2.run();
	}

}