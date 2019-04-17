package tj.exam.ex04;

import tj.exam.ex04.Calculator;
import tj.exam.ex04.SubstractCalc;

class Calculator {
    int left, right;
 
    public void setOp(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() { //2. 상위클래스의 return 형태도 int로 고쳐야한다. 상위클래스의 변경은 바람직하지않다.
        return((this.left + this.right) / 2);
    }
    
}
 
class SubstractCalc extends Calculator {
     @Override
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
    
    /*public int avg() {
    	return((this.left + this.right) / 2); //1. 내가 void타입을 출력하지않고 int타입을 return 하고싶다면
    }*/
    
    public int avg() {
    	return super.avg();
    	//3. 주석처리한 avg코드와 상위클래스의 avg코드가 중복되기때문에
    	//상위클래스(super)의(.) avg메서드를 호출
    	//상위클래스를 수정했을때 하위클래스도 동일한 효과를 받음
    }
}
 
public class OverridingEx2 {
    public static void main(String[] args) {
        SubstractCalc sc1 = new SubstractCalc();
        sc1.setOp(10, 20);
        sc1.sum();
        System.out.println("실행 결과는 " + sc1.avg() + " 입니다.");
        sc1.substract();
    }
}