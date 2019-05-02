package day03;

class Student {
	String name;
	Student(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		//자식->부모간의 대입은 자식에게만 있고 부모에게는 없는것을 없는체하면 되지만
		//부모->자식간의 대입은 자식에게만 있고 부모에게는 없는것을 만들어낼 순 없다.
		Student s = (Student)obj;
		//부모->자식으로의 대입이기때문에 Student 데이터 타입으로 명시적 형변환을 해줘야한다
		//Object는 모든 클래스의 상위클래스이다
		return this.name /*name으로 대입된 s1의 값*/ == s.name; //s2의 값
		//s1에 할당된 값과 obj로 넘어간 s2의 값이 같은가? 를 boolean값으로 넘겨준다
	}
}

class EqualsEx {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2); //false. 서로 다른 객체이기때문
		System.out.println(s1.equals(s2)); 
		//Student(name = s1의 값 egoing)이 들어가고
		//s2가 obj로 대입되게된다 (자식->부모로의 묵시적 형변환)

	}

}