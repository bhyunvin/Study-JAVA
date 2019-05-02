package day03;

/*public class ConstantEx {
    public static void main(String[] args) {
        /*
         * 1. 사과
         * 2. 복숭아
         * 3. 바나나
         *
        int type = 1;
        switch(type){
            case 1:
                System.out.println(57);
                break;
            case 2:
                System.out.println(34);
                break;
            case 3:
                System.out.println(93);
                break;
        }
    }
}*/

public class ConstantEx {
    private final static int APPLE = 1; //final = 변하지않는
    private final static int PEACH = 2; //static = 클래스 전역변수의
    private final static int BANANA = 3;//private = 같은 패키지, 클래스내에서 사용가능
    public static void main(String[] args) {
        int type = APPLE;
        switch(type){
            case APPLE:
                System.out.println(57 + " kcal");
                break;
            case PEACH:
                System.out.println(34 + " kcal");
                break;
            case BANANA:
                System.out.println(93 + " kcal");
                break;
        }
    }
}