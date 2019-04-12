package tj.exam.ex01;

public class For {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + "" + j);
				continue;
			}
		}
	}
}