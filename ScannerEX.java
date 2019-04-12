package tj.exam.ex01;

import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 숫자 = ");
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();
	}
}
