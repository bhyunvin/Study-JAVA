package tj.exam.ex01;

import java.io.IOException;

/*public class Method {
	public static void numbering() {
		for (int i = 0; i < 11; i++) {
			if (i == 0)
				continue;
			System.out.println(i);
		}
	}*/

public class Method {
	public static void numbering(int limit) {
		for (int i = 0; i < limit + 1; i++) {
			if (i == 0)
				continue;
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.print("배열의 최대 숫자 = ");
		int x = System.in.read() - 48;
		numbering(x);
	}
}
