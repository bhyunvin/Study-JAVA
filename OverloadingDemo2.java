package tj.exam.ex05;

public class OverloadingDemo2 extends OverloadingDemo/*class*/{
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class : void A ()");} //오버라이딩
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A(); //상위클래스에도 인자값없는 A라는 메서드가있지만 기능은 하위클래스의 것을 따른다
        od.A(1); //상위클래스에 메서드가 있기때문에 사용가능
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody"); //오버라이딩
         
    }
}