package tj.exam.ex05;

public class OverloadingDemo {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");}
    //리턴타입이 서로 다르면 오류가 생긴다(void, int)
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }//오버로딩 - 메소드의 이름과 리턴값이 같아야하고 매개변수는 달라야한다
     //같은 이름의 다른 기능을하는 메서드를 여러개 정의할수있다!
}
