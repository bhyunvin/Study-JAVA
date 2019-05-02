package day03;

class Student1 implements Cloneable {
	// Cloneable인터페이스는 내용이 하나도없는 인터페이스지만 이 클래스가 복사 가능한 클래스라는것을 JVM에게 알려주는 역할
	String name;

	Student1(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class CloneEx {

	public static void main(String[] args) {
		Student1 s1 = new Student1("egoing");
		try {
			Student1 s2 = (Student1)s1.clone();
			//clone의 return값은 Object이기때문에 Student로 명시적 형변환을 해줘야한다
			//Object는 모든 클래스의 상위클래스이다
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}