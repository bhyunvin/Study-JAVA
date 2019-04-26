package day02;

class DivideException1 extends Exception {
	//상위클래스로 RuntimeException을 상속받지 않았다.
	//CheckedException
	public int left;
	public int right;
    DivideException1(){
        super();
    }
    DivideException1(String message){
        super(message);
    }
    DivideException1(String message, int left, int right){
        super(message);
        this.left = left;
        this.right = right;
    }
}
class Calculator2{
    int left, right;
    public void setOp(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            try {
                throw new DivideException1("0으로 나누는 것은 허용되지 않습니다." , this.left, this.right);
            } catch (DivideException1 e) {
                e.printStackTrace();
            }
        }
        System.out.print(this.left/this.right);
    }
}
public class MyOwnCheckedExceptionEx2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOp(10, 0);
        System.out.print("결과는 = ");
        c1.divide();
    }
}