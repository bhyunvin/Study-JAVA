package day03;

class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    public String toString() {
    	return super.toString() + ", left : " + this.left + ", right : " + this.right;
    }
}
  
public class ToStringCalcEx {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        System.out.println(c1.toString());
        //System.out.println(c1); 25행과 같은결과가 출력된다
        //c1이라는 인스턴스를 출력하건 c1.toString메소드를 호출해서 출력하건 같다
        //자바는 내부적으로 c1이라는 인스턴스의 인자를 toString메서드를 호출한다
        //toString 은 객체를 문자화시켜준다
    }
  
}