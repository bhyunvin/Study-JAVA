package tj.exam.ex04;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class MyOwnExam_WOW {
	public static String examm(int num) {
		int i = num % 2;
		String answer = "";
		if (i == 0) {
			answer = "입력하신 숫자는 짝수입니다.";
		} else if (i != 0) {
			answer = "입력하신 숫자는 홀수입니다.";
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		System.out.print("홀수/짝수 감별을 원하는 숫자를 입력하세요 = ");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			try {
				int i = sc.nextInt();
				System.out.println(MyOwnExam_WOW.examm(i));
				System.out.print("홀수/짝수 감별을 원하는 숫자를 입력하세요 = ");
			} catch (InputMismatchException ime) {
				ime.printStackTrace();
				System.err.println("숫자를 입력하세요!");
			} continue;
		} sc.close();
	}
}