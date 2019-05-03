package day04;

enum Fruit{ //열거형 자체가 클래스이다
	//enum은 열거형(enumerated type)이라고 부른다. 
	//열거형은 서로 연관된 상수들의 집합이라고 할 수 있다.
	
    APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color; //사용자들이 직접 접근하지 못하게 private로 하는게 바람직하다
	public String getColor() { //대신 메서드를 이용해서 접근하게 하자
		return this.color;
	}
    Fruit(String color){
        System.out.println("Call Constructor "+this); //3번 출력된다
        //상수들이 만들어질때마다 인스턴스화하는 과정이 실행됨
        //인스턴스화하게되면 그 인스턴스의 생성자가 호출된다
        //상수가 3개이기때문에 3번 호출됨
        this.color = color;
        //여기서 this는 각각의 인스턴스를 의미		
    }
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class EnumEx {
     
    public static void main(String[] args) {
     
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, color " + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal, color " + Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal, color " + Fruit.BANANA.getColor());
                break;
        }
        
        for(Fruit f : Fruit.values()/*데이터집합에 소속되어있는것을 변수안에 담는다 : 데이터들의 집합*/){
            System.out.println(f+", "+f.getColor());
        }
    }
}