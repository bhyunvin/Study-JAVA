package tj.exam.ex01;

class DivisionableCalculator extends multipleCalc {
    public void division() {
        System.out.println(this.left / this.right);
    }
}
 
public class CalculatorExtendEx2 {
 
    public static void main(String[] args) {
 
        DivisionableCalculator dc1 = new DivisionableCalculator();
        dc1.setOp(20, 20);
        dc1.sum();
        dc1.avg();
        dc1.multiple();
        dc1.division(); //10나누기 20을 했을때 값은 0.5지만 자바에서 정수와 정수간의 연산은 결과가 정수로 나오기때문에 0으로 나온다.
    }
 
}