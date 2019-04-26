package day02;

//이미 정의된 표준예외들을 사용하는게 바람직하다
//남이 보기에도 한눈에 알아볼수있는 코드가 좋은것
//꼭 필요할때만 사용하자
class DivideException extends RuntimeException{
	//unchecked Exception
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}
class Calculator1{
    int left, right;
    public void setOp(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
}
public class MyOwnUncheckedExceptionEx1 {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        c1.setOp(10, 0);
        c1.divide();
    }
}