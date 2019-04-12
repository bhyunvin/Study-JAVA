package tj.exam.ex01;

public class ClassMethodEx {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}

	public static void main(String[] args) {
		ClassMethodEx.sum(10, 20);
		ClassMethodEx.avg(10, 20);
	}
}
