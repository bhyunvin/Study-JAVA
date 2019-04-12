package tj.exam.ex01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Method5 {
	public static String numbering(int start, int limit) {
		String output = "";
		for (int i = start; i < limit; i++) {
			output += i+" ";
		}
		return output;
    }
 
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
            bw.write(result);
            bw.close();
        } catch (IOException e) {
        }
    }
}