package tj.exam.ex01;

class multipleCalc extends Calculator {
	public void multiple() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorExtendEx {
	public static void main(String[] args) {
		multipleCalc mc1 = new multipleCalc();
		mc1.setOp(10, 20);
		mc1.multiple();
		mc1.sum();
		mc1.avg();
	}
}
