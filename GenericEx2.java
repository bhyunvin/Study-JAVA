package day04;

class EmployeeInfo1{
    public int rank;
    EmployeeInfo1(int rank){ this.rank = rank; }
}
class Person1<T, S>{
    public T info;
    public S id;
    Person1(T info, S id){ 
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
public class GenericEx2 {
    public static void main(String[] args) {
        EmployeeInfo1 e = new EmployeeInfo1(1);
        Integer i = new Integer(10);
        Person1<EmployeeInfo1, Integer> p1 = new Person1<EmployeeInfo1, Integer>(e, i);
        p1.<EmployeeInfo1>printInfo(e);
        p1.printInfo(e);
    }
}