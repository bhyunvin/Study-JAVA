package day02;

import java.io.IOException;

public class ThrowsExceptionEx2 {
	void throwArithmeticException() {
		throw new ArithmeticException(); //상위클래스중 RuntimeException이 있음
	}

	void throwIOException() {
		try {
			throw new IOException(); //상위클래스중 RuntimeException이 없음
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//RuntimeException의 하위클래스는 UncheckedException, RuntimeException의 하위클래스가
//아닌 클래스는 CheckedException이다.
//CheckedException은 반드시 try/catch나 throws를 사용해서 예외를 처리해야함.
//UncheckedException은 처리하지 않아도 된다.