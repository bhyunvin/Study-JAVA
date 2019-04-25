package day01;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z(); 
    }//z를 간접적으로 private를 호출할수는 있지만 class에서 직접적으로 private를 호출할수는 없다
}
public class AccessModifierEx1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());
    }
}