package day04;

class A{
    public int id;
    A(int id){
    	System.out.println("Basic Constructor");
        this.id = id;
    }
}
public class ReferenceEx1 {
 
    public static void runValue(){
        int a = 1; //a=1
        int b = a; //a에 담겨있는 1이란 값을 복제해서 변수 b에 저장하게 된다
        b = 2;
        System.out.println("runValue, "+a); 
        //실행결과 1
        //기본 데이터타입으로 하면 참조가 아닌 복제가 일어난다
    }
     
    public static void runReference(){ //참조
    	//구체적인 값을 갖고있는게 아닌 인스턴스를 구별할 수 있는 주소값만을 가지고있음
        A a = new A(1); //a라는 인스턴스를 메모리에 할당해놓고 그 주소값을 가지고있음
        A b = a; //a인스턴스의 주소값을 b에게도 알려줌
        b.id = 2;//둘다 같은 인스턴스 주소값을 갖고있는 와중에 b가 값을 2로 바꿔버림
        System.out.println("runReference, "+a.id);   
        //실행결과 2
        //객체를 만들어 기본 데이터타입이 아닌것들은 변수를 만들게되면 그 변수들은 인스턴스,
        //객체의 주소값만 알고있기때문에 a, b 모두가 바뀐다
    }
 
    public static void main(String[] args) {
        runValue();
        runReference();
    }
 
}