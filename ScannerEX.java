package tj.exam.ex01;

import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� ���� = ");
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();
	}
}
