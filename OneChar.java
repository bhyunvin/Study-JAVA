package tj.exam.ex01;

import java.io.IOException;

public class OneChar {
	public static void main(String[] args) throws IOException {
		System.out.print("입력하실 문자 = ");
		char ch = (char) System.in.read();
		System.out.println("입력하신 문자 = " + ch);
	}

}
