package day02;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null; //에러만 임시적으로 지우는방식
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(input); 
    }
}
