package day04;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{ //복수의 제네릭이 필요하면 콤마로 구분하고 서로 이름이 달라야한다
	//제네릭은 기본 데이터타입이 아닌 참조형(새로 만들어낸 데이터타입)만 올 수 있다.
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
}
public class GenericEx1 {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10); //기존 int였던 10이 int의 래퍼클래스 Integer의 생성자가 되어서
        //숫자 10을 의미하는 하나의 인스턴스를 만들었다.
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
        System.out.println(p1.id.intValue()); //10
    }
}