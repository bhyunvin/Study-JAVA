package tj.exam.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�Է��Ͻ� ���ڿ� = ");
		String str = br.readLine();
		System.out.println("�Է��Ͻ� ���ڿ� = " + str);

	}

}