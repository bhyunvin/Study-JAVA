package day05;

import java.util.Scanner;

public class ScannerEx3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 = ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요 = ");
		String password = sc.nextLine();
		sc.close();
		if (id.equals("bhyunvin")) {
			if (password.equals("1111")) {
				System.out.println("로그인되었습니다.");
			} else {
				System.out.println("로그인에 실패했습니다.");
			}
		}
	}
}
