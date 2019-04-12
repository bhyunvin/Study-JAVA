package tj.exam.ex01;

public class ScopeDemo {
	static int i;

	static void a() {
		i = 0;
	}

	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}
} //0으로 무한반복