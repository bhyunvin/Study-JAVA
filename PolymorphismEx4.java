package day01;

class C{
    public String x(){return "A.x";}
}
class D extends C{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class D2 extends C{
    public String x(){return "B2.x";}
}
public class PolymorphismEx4 {
    public static void main(String[] args) {
        C obj = new D();
        C obj2 = new D2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}