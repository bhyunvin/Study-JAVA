package tj.exam.ex03;

class Calculator {
    int left, right;
 
    public void setOp(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() { // 3. sum 메소드를 찾게된다
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractCalc extends Calculator { // 2. 상위클래스인 Calculator 클래스를 찾아가고
     @Override
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    } //상위클래스 Calculator이 갖고있는 sum이라는 메소드를 재정의(Overriding) 하고있다
    //기본값은 상위클래스의 것을, 기능(메소드)는 하위클래스의 것을 사용한다 (상위클래스의 기능은 무시된다)
    //1. 메소드의 이름이 같아야하며,
    //메소드의 매개변수가 같아야하고(2. 매개변수의 갯수/ 3. 데이터타입/ 4. 순서),
    //5.return (여기서는 void) 형태도 같아야한다.
    //상위클래스의 메서드를 상속받지않고 하위클래스에서 새롭게 변경한다
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class OverridingEx {
    public static void main(String[] args) {
        SubstractCalc c1 = new SubstractCalc();
        c1.setOp(10, 20);
        c1.sum(); // 1. 만약 SubstractCalc에 sum이란 메소드가 없다면
        c1.avg();
        c1.substract();
    }
}
