package day01;

abstract class Calculator3{
    int left, right;
    public void setOp(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus1 extends Calculator3 {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus1 extends Calculator3 {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class PolymorphismCalculator {
	
    public static void execute(Calculator3 cal){
        System.out.println("실행결과");
        cal.run();	
    }
    
    public static void main(String[] args) { 
        Calculator3 c1 = new CalculatorDecoPlus1();
        c1.setOp(10, 20);
        c1.run();
         
        Calculator3 c2 = new CalculatorDecoMinus1();
        c2.setOp(20, 40);
        c2.run();
        
        execute(c1);
        execute(c2);
    }
   
}