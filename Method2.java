package tj.exam.ex01;

import java.io.IOException;
import java.util.Scanner;

/*public class Method2 {
	public static void numbering() {
		for (int i = 0; i < 11; i++) {
			if (i == 0)
				continue;
			System.out.println(i);
		}
	}*/

public class Method2 {
	public static void numbering(int limit) {
		for (int i = 0; i < limit + 1; i++) {
			if (i == 0)
				continue;
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.print("배열의 최대 숫자 = ");
Scanner scn = new Scanner(System.in);
int e = scn.nextInt();
		numbering(e);
		scn.close();
	}
}
