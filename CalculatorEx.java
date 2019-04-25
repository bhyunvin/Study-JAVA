package day01;

class Calculator{
    private int left, right;
   // int left, right;
     
    public void setOp(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int sum(){
        return this.left+this.right;
    }
    protected void sumDecoPlus(){
        System.out.println("더하기 연산을 한 결과는 = "+sum());
    }
}
  
public class CalculatorEx {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();
        c1.setOp(10, 20);
        // c1.left = 100;
        // 맨 위의 전역변수 int left, right를 private로 지정하지 않으면
        // 22행과같이 변수를 마음대로 바꿀수있게된다.
        c1.sumDecoPlus();
    }
}