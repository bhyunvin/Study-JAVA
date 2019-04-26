package day02;

import java.io.*;

class B {
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null;
		String input = null; // 에러만 임시적으로 지우는방식
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C {
	void run() {
		B b = new B();
		try {
			b.run();
		} catch (FileNotFoundException fnfe) {
			//FileNotFoundException은 IOException의 하위클래스이기때문에
			//IOException을 try/catch로 묶었다면 쓸필요가 없을수도 있다.
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}

public class ThrowsExceptionEx1 {
	public static void main(String[] args) {
		C c = new C();
		c.run();
	}
}