package day01;

class AAAAAAA{
    public String x(){return "A.x";}
}
class BBBBB extends AAAAAAA{
    public String x(){return "B.x";}
    //기능은 더 많은기능을 가지고있는 하위클래스의 것을 따르기 때문에
    //AAAAAAA클래스의 x() 은 실행되지않는다.
    public String y(){return "y";}
}
public class PolymorphismEx3 {
    public static void main(String[] args) {
        AAAAAAA obj = new BBBBB();
        //클래스 BBBBB를 인스턴스화해서 클래스타입 AAAAAAA인 객체 obj 안에 담았다.
        System.out.println(obj.x());
       // System.out.println(obj.y());
        //AAAAAAA행세를 obj라는 객체가 하고있기때문에 AAAAAAA에 정의되어있지않은 y()는 실행되지않는다
    }
}