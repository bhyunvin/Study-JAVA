package day04;

public class ReferenceParameterEx {
    
    static void _value(int b){
        b = 2;
    }
     
    public static void runValue(){
        int a = 1;
        _value(a); //int b = a; 의 뜻과 같다. a를 b에 대입하겠다
        System.out.println("runValue, "+a);
    }
     
    static void _reference1(A b){
        b = new A(2); //새로운 객체를 만들었다
        //a와 b는 각자 다른 인스턴스를 참조하고있다
        //따라서  a에 변화를 주지못한다
    }
     
    public static void runReference1(){
        A a = new A(1); //참조
        _reference1(a); //A b = a;
        System.out.println("runReference1, "+a.id);     
    }
     
    static void _reference2(A b){
        b.id = 2;  //새로운 객체를 만들지않고  a의 인스턴스의 주소값을 참조하고있다
        //a와 b는 같은 인스턴스를 참조하고있으므로 b가 2로 바뀌면 a도 2로 바뀌게된다
    }
 
    public static void runReference2(){
        A a = new A(1); //a라는 객체에 1이라는 값을 넣었다
        _reference2(a); //A b = a;
        System.out.println("runReference2, "+a.id);     
    }
     
    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }
 
}