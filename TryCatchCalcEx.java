package day02;

class Calculator{
    int left, right;
    public void setOp(int left, int right){
    /*
    	if (right == 0) {
    		throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
    	}
    	더하기, 빼기 곱하기 등은 두번째 인자가 0이어도 상관없으므로 divide에서 예외를 발생시키는것이 낫겠다.
    	*/
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	if (right == 0) {
    		throw new ArithmeticException("0으로 나눌 수 없습니다.");
    	} //1. divide에 오류가 생기면 if문에서 divide를 끊어버리고
    	//3. new로 선언한 ArithmeticException 객체를
    	
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(ArithmeticException e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            //간단한형태의 예외내용
            System.out.println("\n\ne.toString()\n"+e.toString());
            //e라는 예외 인스턴스에대한 자세한 정보
            System.out.println("\n\ne.printStackTrace()");
            //예외에관한 가장 자세한 정보
            e.printStackTrace();
        } catch (Exception e) {
        	System.out.println("오류!");
        } finally {
			System.out.println("finally");
		}
    }
} 
public class TryCatchCalcEx {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOp(10, 0);
        try {
        	c1.divide();
        	//2.오류가있는 divide를 호출한 main 메서드에 try/catch가 있으므로
        } catch (ArithmeticException e) {
        	//4. 3번의 내용을 e에 넣어주게된다
        	System.out.println(e.getMessage());
        }
    }
}