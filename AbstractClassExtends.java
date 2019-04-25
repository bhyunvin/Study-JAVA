package day01;

abstract class AAA{
    public abstract int b();
    public void d(){
        System.out.println("World");
    }
}
class BB extends AAA{
	@Override
    public int b(){return 1;}
}
public class AbstractClassExtends {
    public static void main(String[] args) {
        BB obj = new BB();
        System.out.println(obj.b());
        obj.d();
    }
}